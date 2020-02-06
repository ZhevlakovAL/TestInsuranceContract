package virtu.systems.demo.map;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.dao.entity.Contract;

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
    Contract toDao(ContractCreateRequestDto dto);

    Contract toDao(ContractUpdateRequestDto dto);

}
