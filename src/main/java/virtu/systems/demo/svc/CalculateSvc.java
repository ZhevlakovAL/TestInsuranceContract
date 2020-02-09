package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;
import virtu.systems.demo.config.JsonProperties;
import virtu.systems.demo.map.CalculateMapper;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class CalculateSvc {

    private final JsonProperties properties;

    public CalculateSvc(final JsonProperties properties) {
        this.properties = properties;
    }

    public CalculateInsurancePremiumResponseDto calculate(final CalculateInsurancePremiumRequestDto data) {
        CalculateInsurancePremiumResponseDto responseDto = CalculateMapper.INSTANCE.toResponseDto(data);

        //Страховая премия = (Страховая сумма / кол-во дней) * Коэф.ТН * Коэф.ГП * Коэф.Пл
        responseDto.setInsurancePremium((long) (
                        (responseDto.getInsuranceAmount() / getDifferenceDays(responseDto.getValidityPeriodFrom(), responseDto.getValidityPeriodTo()))
                                * properties.getTypeRate(responseDto.getType())
                                * properties.getYearRate(responseDto.getConstructionYear())
                                * properties.getSquareRate(responseDto.getSquare())
                )
        );

        responseDto.setCalculatedDate(new Date());
        return responseDto;
    }

    private static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
