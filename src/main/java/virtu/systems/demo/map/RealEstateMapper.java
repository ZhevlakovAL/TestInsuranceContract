package virtu.systems.demo.map;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.RealEstateCreateDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.entity.RealEstate;

@org.mapstruct.Mapper
public interface RealEstateMapper {

    RealEstateMapper INSTANCE = Mappers.getMapper(RealEstateMapper.class);

    RealEstateCreateDto toRequestDto(RealEstate dao);

    RealEstate toDao(RealEstateCreateDto dto);

}
