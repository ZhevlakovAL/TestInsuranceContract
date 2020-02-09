package virtu.systems.demo.map;

import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.RealEstateCreateDto;
import virtu.systems.demo.api.dto.RealEstateDto;
import virtu.systems.demo.dao.entity.RealEstate;

@org.mapstruct.Mapper
public interface RealEstateMapper {

    RealEstateMapper INSTANCE = Mappers.getMapper(RealEstateMapper.class);

    RealEstateCreateDto toRequestDto(RealEstate dao);

    RealEstate toDao(RealEstateCreateDto dto);

    RealEstateDto toDto(RealEstate realEstate);

    RealEstate toDao(RealEstateDto realEstateDto);
}
