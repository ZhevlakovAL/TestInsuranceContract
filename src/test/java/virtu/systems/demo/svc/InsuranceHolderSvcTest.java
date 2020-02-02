package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import virtu.systems.demo.DemoApplication;
import virtu.systems.demo.api.dto.InsuranceHolderRequestDto;
import virtu.systems.demo.dao.repo.InsuranceHolderRepo;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class InsuranceHolderSvcTest {

    @Autowired
    private InsuranceHolderSvc svc;

    @Autowired
    private InsuranceHolderRepo repo;

    @Test
    void getAll() {
    }

    @Test
    void add() {
        repo.deleteAll();
        val holder = new InsuranceHolderRequestDto()
                .firstName("Алексей")
                .middleName("Леонидович")
                .lastName("Жевлаков")
                .passportId("1222")
                .passportSeries("199191")
                .birthDate(Date.from(Instant.now()));
        svc.add(holder);
        assertEquals(1, repo.findAll().size());
    }
}