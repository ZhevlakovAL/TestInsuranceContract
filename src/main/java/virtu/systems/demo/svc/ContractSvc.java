package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.entity.RealEstate;
import virtu.systems.demo.dao.repo.ContractRepo;
import virtu.systems.demo.dao.repo.RealEstateRepo;
import virtu.systems.demo.map.ContractMapper;
import virtu.systems.demo.map.RealEstateMapper;

import java.util.function.Function;

@Slf4j
@Service
public class ContractSvc {

    private final ContractRepo contractRepo;
    private final RealEstateRepo realEstateRepo;

    public ContractSvc(final ContractRepo contractRepo, final RealEstateRepo realEstateRepo) {
        this.contractRepo = contractRepo;
        this.realEstateRepo = realEstateRepo;
    }

    public ContractDto get(final Long id) {
        return Function.<Long>identity()
                .andThen(this::getById)
                .andThen(ContractMapper.INSTANCE::toDto)
                .apply(id);
    }

    private Contract getById(final Long id) {
        return contractRepo.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("unknown Id %d", id)));
    }

    public ContractsResponseDto getAll() {
        return ContractMapper.INSTANCE.toResponse(contractRepo.findAll());
    }

    @Transactional
    public ContractDto add(
            final ContractCreateRequestDto createRequestDto
    ) {
        final RealEstate realEstate = RealEstateMapper.INSTANCE.toDao(createRequestDto.getInsuranceObject());
        realEstateRepo.save(realEstate);
        Contract contract = ContractMapper.INSTANCE.toDao(createRequestDto);
        contract.setInsuranceObject(realEstate);
        contractRepo.save(contract);
        return ContractMapper.INSTANCE.toDto(contract);
    }

    @Transactional
    public ContractDto update(
            final ContractUpdateRequestDto updateRequestDto) {
        getById(updateRequestDto.getId());
        return Function.<ContractUpdateRequestDto>identity()
                .andThen(ContractMapper.INSTANCE::toDao)
                .andThen(contractRepo::save)
                .andThen(ContractMapper.INSTANCE::toDto)
                .apply(updateRequestDto);
    }

}
