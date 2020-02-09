package virtu.systems.demo.api;

import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import virtu.systems.demo.svc.CalculateSvc;

@Api(tags = "Calculate")
@Controller
public class CalculateApiController implements CalculateApi {

    private final CalculateSvc svc;

    public CalculateApiController(final CalculateSvc svc) {
        this.svc = svc;
    }

    public ResponseEntity<CalculateInsurancePremiumResponseDto> calculateInsurancePremium(CalculateInsurancePremiumRequestDto data) {
        return ResponseEntity.ok(svc.calculate(data));
    }

}
