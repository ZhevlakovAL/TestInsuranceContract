package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtu.systems.demo.api.dto.InsuranceHolderDto;
import virtu.systems.demo.api.dto.InsuranceHolderRequestDto;
import virtu.systems.demo.api.dto.InsuranceHoldersResponseDto;
import virtu.systems.demo.dao.entity.InsuranceHolder;
import virtu.systems.demo.dao.repo.InsuranceHolderRepo;
import virtu.systems.demo.map.InsuranceHolderMapper;

import java.util.Optional;
import java.util.function.Function;

@Slf4j
@Service
public class InsuranceHolderSvc {

    private InsuranceHolderRepo repo;

    public InsuranceHolderSvc(final InsuranceHolderRepo repo) {
        this.repo = repo;
    }

    public InsuranceHolderDto get(final Long id) {
        return Function.<Long>identity()
                .andThen(this::getById)
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(id);
    }

    private InsuranceHolder getById(final Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("unknown Id %d", id)));
    }

    public InsuranceHoldersResponseDto getAll() {
        return Optional.of(Specification.<InsuranceHolder>where(null))
                .map(repo::findAll)
                .map(InsuranceHolderMapper.INSTANCE::toResponse)
                .get();
    }

    @Transactional
    public InsuranceHolderDto add(
            final InsuranceHolderRequestDto eventRequestDto
    ) {
        return Function.<InsuranceHolderRequestDto>identity()
                .andThen(InsuranceHolderMapper.INSTANCE::toDao)
                .andThen(x -> repo.save(x))
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(eventRequestDto);
    }

    public InsuranceHolderDto update(
            final Long id,
            final InsuranceHolderRequestDto insuranceHolder) {
        return Function.<Long>identity()
                .andThen(this::get)
                .andThen(h -> {
                    val _h = InsuranceHolderMapper.INSTANCE.toDao(insuranceHolder);
                    _h.setId(h.getId());
                    return _h;
                })
                .andThen(x -> repo.save(x))
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(id);
    }

    public InsuranceHolderDto delete(
            final Long id) {
        return Function.<Long>identity()
                .andThen(this::getById)
                .andThen(h -> {
                    repo.deleteById(id);
                    return h;
                })
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(id);
    }

}
