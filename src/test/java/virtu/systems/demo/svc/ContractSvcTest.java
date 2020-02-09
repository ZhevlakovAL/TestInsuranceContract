package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import virtu.systems.demo.DemoApplication;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.api.dto.RealEstateCreateDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.entity.InsuranceHolder;
import virtu.systems.demo.dao.entity.RealEstate;
import virtu.systems.demo.dao.repo.ContractRepo;
import virtu.systems.demo.dao.repo.InsuranceHolderRepo;
import virtu.systems.demo.dao.repo.RealEstateRepo;
import virtu.systems.demo.map.ContractMapper;
import virtu.systems.demo.map.RealEstateMapper;

import java.sql.Date;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ContractSvcTest {


    @Autowired
    private ContractSvc svc;

    @Autowired
    private ContractRepo contractRepo;

    @Autowired
    private InsuranceHolderRepo insuranceHolderRepo;

    @Autowired
    private RealEstateRepo realEstateRepo;

    @Before
    public void setUp() throws Exception {
        contractRepo.deleteAll();
        insuranceHolderRepo.deleteAll();
        realEstateRepo.deleteAll();
    }

    @Test
    public void get() {
        Date someDate = new Date(Instant.now().toEpochMilli());
        InsuranceHolder insuranceHolder = InsuranceHolder.builder()
                .firstName("Алексей")
                .middleName("Леонидович")
                .lastName("Жевлаков")
                .passportId("1222")
                .passportSeries("199191")
                .birthDate(someDate)
                .build();

        RealEstate realEstate = RealEstate.builder()
                .apartment(333)
                .area("dddd")
                .constructionYear(3322)
                .house(32233)
                .housing("3233")
                .index("231")
                .region("region")
                .settlement("settlement")
                .square(33.)
                .state("233")
                .street("dfff")
                .structure("fdffff")
                .type("ddd")
                .build();

        Contract contract = Contract.builder()
                .contractNumber(233)
                .calculatedDate(someDate)
                .conclusionDate(someDate)
                .description("desc")
                .insuranceAmount(233L)
                .insuranceObject(realEstate)
                .insurancePremium(333L)
                .validityPeriodFrom(someDate)
                .validityPeriodTo(someDate)
                .insuranceHolder(insuranceHolder)
                .build();

        insuranceHolderRepo.save(insuranceHolder);
        realEstateRepo.save(realEstate);
        contractRepo.save(contract);

        ContractDto contractDto = svc.get(contract.getId());

        assertEquals(contractDto.getId(), contract.getId());
    }

    @Test
    public void getAll() {
        Date someDate = new Date(Instant.now().toEpochMilli());
        InsuranceHolder insuranceHolder = InsuranceHolder.builder()
                .firstName("Алексей")
                .middleName("Леонидович")
                .lastName("Жевлаков")
                .passportId("1222")
                .passportSeries("199191")
                .birthDate(someDate)
                .build();

        RealEstate realEstate = RealEstate.builder()
                .apartment(333)
                .area("dddd")
                .constructionYear(3322)
                .house(32233)
                .housing("3233")
                .index("231")
                .region("region")
                .settlement("settlement")
                .square(33.)
                .state("233")
                .street("dfff")
                .structure("fdffff")
                .type("ddd")
                .build();

        Contract contract = Contract.builder()
                .contractNumber(233)
                .calculatedDate(someDate)
                .conclusionDate(someDate)
                .description("desc")
                .insuranceAmount(233L)
                .insuranceObject(realEstate)
                .insurancePremium(333L)
                .validityPeriodFrom(someDate)
                .validityPeriodTo(someDate)
                .insuranceHolder(insuranceHolder)
                .build();

        insuranceHolderRepo.save(insuranceHolder);
        realEstateRepo.save(realEstate);
        contractRepo.save(contract);

        ContractsResponseDto contracts = svc.getAll();

        assertEquals(1, contracts.getContracts().size());
    }

    @Test
    public void add() {
        Date someDate = new Date(Instant.now().toEpochMilli());
        InsuranceHolder insuranceHolder = InsuranceHolder.builder()
                .firstName("Алексей")
                .middleName("Леонидович")
                .lastName("Жевлаков")
                .passportId("1222")
                .passportSeries("199191")
                .birthDate(someDate)
                .build();

        RealEstate realEstate = RealEstate.builder()
                .apartment(333)
                .area("dddd")
                .constructionYear(3322)
                .house(32233)
                .housing("3233")
                .index("231")
                .region("region")
                .settlement("settlement")
                .square(33.)
                .state("233")
                .street("dfff")
                .structure("fdffff")
                .type("ddd")
                .build();

        Contract contract = Contract.builder()
                .contractNumber(233)
                .calculatedDate(someDate)
                .conclusionDate(someDate)
                .description("desc")
                .insuranceAmount(233L)
                .insuranceObject(realEstate)
                .insurancePremium(333L)
                .validityPeriodFrom(someDate)
                .validityPeriodTo(someDate)
                .insuranceHolder(insuranceHolder)
                .build();

        insuranceHolderRepo.save(insuranceHolder);

        RealEstateCreateDto realEstateDto =
                RealEstateMapper.INSTANCE.toRequestDto(realEstate);
        ContractCreateRequestDto contractRequestDto =
                ContractMapper.INSTANCE.toRequestDto(contract);
        contractRequestDto.setInsuranceHolderId(insuranceHolder.getId());
        contractRequestDto.setInsuranceObject(realEstateDto);

        ContractDto contractDto = svc.add(contractRequestDto);

        assertNotNull(contractDto.getId());
    }

    @Test
    public void update() {
        Date someDate = new Date(Instant.now().toEpochMilli());
        InsuranceHolder insuranceHolder = InsuranceHolder.builder()
                .firstName("Алексей")
                .middleName("Леонидович")
                .lastName("Жевлаков")
                .passportId("1222")
                .passportSeries("199191")
                .birthDate(someDate)
                .build();

        RealEstate realEstate = RealEstate.builder()
                .apartment(333)
                .area("dddd")
                .constructionYear(3322)
                .house(32233)
                .housing("3233")
                .index("231")
                .region("region")
                .settlement("settlement")
                .square(33.)
                .state("233")
                .street("dfff")
                .structure("fdffff")
                .type("ddd")
                .build();

        Contract contract = Contract.builder()
                .contractNumber(233)
                .calculatedDate(someDate)
                .conclusionDate(someDate)
                .description("desc")
                .insuranceAmount(233L)
                .insuranceObject(realEstate)
                .insurancePremium(333L)
                .validityPeriodFrom(someDate)
                .validityPeriodTo(someDate)
                .insuranceHolder(insuranceHolder)
                .build();

        insuranceHolderRepo.save(insuranceHolder);
        realEstateRepo.save(realEstate);
        contractRepo.save(contract);

        ContractUpdateRequestDto contractRequestDto =
                ContractMapper.INSTANCE.toUpdateRequestDto(contract);

        contractRequestDto.description("xxx");

        ContractDto contractDto = svc.update(contractRequestDto);

        assertEquals("desc", contract.getDescription());
        assertEquals("xxx", contractDto.getDescription());
    }

}