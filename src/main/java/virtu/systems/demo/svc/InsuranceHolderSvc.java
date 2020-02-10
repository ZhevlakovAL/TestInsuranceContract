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

import static virtu.systems.demo.util.Specs.andSpec;
import static virtu.systems.demo.util.Specs.equal;
import static virtu.systems.demo.util.Specs.like;

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

    public InsuranceHoldersResponseDto getAll(final Optional<String> lastName,
                                              final Optional<String> firstName,
                                              final Optional<String> middleName,
                                              final Optional<String> passportSeries,
                                              final Optional<String> passportId) {
        return Optional.of(Specification.<InsuranceHolder>where(null))
                .map(andSpec(v -> like("lastName", v), lastName))
                .map(andSpec(v -> like("firstName", v), firstName))
                .map(andSpec(v -> like("middleName", v), middleName))
                .map(andSpec(v -> equal("passportSeries", v), passportSeries))
                .map(andSpec(v -> equal("passportId", v), passportId))
                .map(repo::findAll)
                .map(InsuranceHolderMapper.INSTANCE::toResponse)
                .get();
    }

    @Transactional
    public InsuranceHolderDto add(
            final InsuranceHolderRequestDto dto
    ) {
        return Function.<InsuranceHolderRequestDto>identity()
                .andThen(InsuranceHolderMapper.INSTANCE::toDao)
                .andThen(x -> repo.save(x))
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(dto);
    }

    @Transactional
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

    @Transactional
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
