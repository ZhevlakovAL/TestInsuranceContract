package virtu.systems.demo.api;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import virtu.systems.demo.api.dto.RealEstateTypesResponseDto;
import virtu.systems.demo.config.JsonProperties;
import virtu.systems.demo.map.RealEstateMapper;

@Api(tags = "RealEstate")
@Controller
public class RealEstateApiController implements RealEstateApi {

    private final JsonProperties properties;

    public RealEstateApiController(final JsonProperties properties) {
        this.properties = properties;
    }

    public ResponseEntity<RealEstateTypesResponseDto> getRealEstateTypes() {
        return ResponseEntity.ok(RealEstateMapper.INSTANCE.toResponse(properties.getTypes()));
    }

}
