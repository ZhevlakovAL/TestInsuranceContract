package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
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

    private InsuranceHolderRepo insuranceHolderRepo;

    public InsuranceHolderSvc(final InsuranceHolderRepo insuranceHolderRepo) {
        this.insuranceHolderRepo = insuranceHolderRepo;
    }

    public InsuranceHoldersResponseDto getAll() {
        return Optional.of(Specification.<InsuranceHolder>where(null))
                .map(insuranceHolderRepo::findAll)
                .map(InsuranceHolderMapper.INSTANCE::toResponse)
                .get();
    }

    @Transactional
    public InsuranceHolderDto add(
            final InsuranceHolderRequestDto eventRequestDto
    ) {
        return Function.<InsuranceHolderRequestDto>identity()
                .andThen(InsuranceHolderMapper.INSTANCE::toDao)
                .andThen(x -> insuranceHolderRepo.save(x))
                .andThen(InsuranceHolderMapper.INSTANCE::toDto)
                .apply(eventRequestDto);
    }

}
