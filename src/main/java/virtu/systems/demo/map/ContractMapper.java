package virtu.systems.demo.map;

import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.api.dto.RealEstateDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.entity.InsuranceHolder;
import virtu.systems.demo.dao.entity.RealEstate;

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

    @Mapping(target = "insuranceObject", source = "insuranceObject", qualifiedByName = "toInsuranceObjectDao")
    @Mapping(target = "insuranceHolder", source = "insuranceHolderId", qualifiedByName = "toInsuranceHolder")
    Contract toDao(ContractUpdateRequestDto dto);

    @Named("toInsuranceObjectDao")
    default RealEstate toInsuranceObjectDao(RealEstateDto insuranceObject) {
        return RealEstateMapper.INSTANCE.toDao(insuranceObject);
    }

    @Mapping(target = "insuranceObject", ignore = true)
    @Mapping(target = "insuranceHolderId", ignore = true)
    ContractCreateRequestDto toRequestDto(Contract dao);

    @Mapping(target = "insuranceObject", source = "insuranceObject", qualifiedByName = "toInsuranceObjectDto")
    @Mapping(target = "insuranceHolderId", source = "insuranceHolder.id")
    ContractUpdateRequestDto toUpdateRequestDto(Contract contract);

    @Named("toInsuranceObjectDto")
    default RealEstateDto toInsuranceHolder(RealEstate insuranceObject) {
        return RealEstateMapper.INSTANCE.toDto(insuranceObject);
    }
}
