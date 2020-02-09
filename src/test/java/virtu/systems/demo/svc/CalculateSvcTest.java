package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import virtu.systems.demo.DemoApplication;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CalculateSvcTest {

    @Autowired
    private CalculateSvc svc;

    @Test
    public void calculate() {
        CalculateInsurancePremiumRequestDto data = new CalculateInsurancePremiumRequestDto()
                .constructionYear(2010);
        CalculateInsurancePremiumResponseDto responseDto = svc.calculate(data);
        assertEquals(data.getConstructionYear(), responseDto.getConstructionYear());
        //assertEquals(9090L, responseDto.getInsuranceAmount());

    }
}