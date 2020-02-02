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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        return Optional.of(eventRequestDto)
                .map(InsuranceHolderMapper.INSTANCE::toDao)
                .map(insuranceHolderRepo::save)
                .map(InsuranceHolderMapper.INSTANCE::toDto)
                .get();
    }

}
