package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;
import virtu.systems.demo.config.JsonProperties;
import virtu.systems.demo.map.CalculateMapper;

@Slf4j
@Service
public class CalculateSvc {

    private final JsonProperties properties;

    public CalculateSvc(final JsonProperties properties) {
        this.properties = properties;
    }

    public CalculateInsurancePremiumResponseDto calculate(final CalculateInsurancePremiumRequestDto data) {
        CalculateInsurancePremiumResponseDto responseDto = CalculateMapper.INSTANCE.toResponseDto(data);
        //responseDto.setInsuranceAmount((long)properties.getPort());
        //responseDto.setInsuranceAmount(Long.parseLong(properties.getEnv().getProperty("port")));
        return responseDto;
    }
}
