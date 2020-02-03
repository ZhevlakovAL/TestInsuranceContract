package virtu.systems.demo.map;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.InsuranceHolderDto;
import virtu.systems.demo.api.dto.InsuranceHolderRequestDto;
import virtu.systems.demo.api.dto.InsuranceHoldersResponseDto;
import virtu.systems.demo.dao.entity.InsuranceHolder;

import java.util.List;

@org.mapstruct.Mapper
public interface InsuranceHolderMapper {

    InsuranceHolderMapper INSTANCE = Mappers.getMapper(InsuranceHolderMapper.class);

    InsuranceHolderDto toDto(InsuranceHolder insuranceHolder);

    List<InsuranceHolderDto> toDto(List<InsuranceHolder> insuranceHolders);

    default InsuranceHoldersResponseDto toResponse(List<InsuranceHolder> insuranceHolders) {
        return new InsuranceHoldersResponseDto().insuranceHolders(toDto(insuranceHolders));
    }

    @Mapping(target = "id", ignore = true)
    InsuranceHolder toDao(InsuranceHolderRequestDto insuranceHolderRequestDto);

    default java.sql.Date convertUtilToSql(java.util.Date uDate) {
        return new java.sql.Date(uDate.getTime());
    }
}
