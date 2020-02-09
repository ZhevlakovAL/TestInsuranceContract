package virtu.systems.demo.map;

import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;

@org.mapstruct.Mapper
public interface CalculateMapper {

    CalculateMapper INSTANCE = Mappers.getMapper(CalculateMapper.class);

    CalculateInsurancePremiumResponseDto toResponseDto(CalculateInsurancePremiumRequestDto contract);

}
