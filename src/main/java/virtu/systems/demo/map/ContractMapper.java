package virtu.systems.demo.map;

import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.entity.InsuranceHolder;

import java.util.List;

@org.mapstruct.Mapper
public interface ContractMapper {

    ContractMapper INSTANCE = Mappers.getMapper(ContractMapper.class);

    ContractDto toDto(Contract contract);

    List<ContractDto> toDto(List<Contract> contracts);

    default ContractsResponseDto toResponse(List<Contract> contracts) {
        return new ContractsResponseDto().contracts(toDto(contracts));
    }

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "insuranceHolder", source = "insuranceHolderId", qualifiedByName = "toInsuranceHolder")
    Contract toDao(ContractCreateRequestDto dto);

    @Named("toInsuranceHolder")
    default InsuranceHolder toInsuranceHolder(Long insuranceHolderId) {
        return InsuranceHolder.builder().id(insuranceHolderId).build();
    }

    Contract toDao(ContractUpdateRequestDto dto);

    @Mapping(target = "insuranceObject", ignore = true)
    @Mapping(target = "insuranceHolderId", ignore = true)
    ContractCreateRequestDto toRequestDto(Contract dao);
}
