package virtu.systems.demo.api;

import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.io.IOException;
import java.util.List;

@Api(tags = "Contract")
@Controller
public class ContractApiController implements ContractApi {

    private static final Logger log = LoggerFactory.getLogger(ContractApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContractApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ContractDto> getContractById(@ApiParam(value = "Id of Contract",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractDto>(objectMapper.readValue("{  \"calculatedDate\" : \"2020-01-01\",  \"insuranceAmount\" : 123123,  \"insurancePremium\" : 123123,  \"validityPeriodFrom\" : \"2020-01-01\",  \"insuranceObject\" : {    \"area\" : \"Советский\",    \"constructionYear\" : 2012,    \"housing\" : \"2\",    \"index\" : \"23452\",    \"type\" : \"Квартира\",    \"house\" : 3,    \"structure\" : \"\",    \"settlement\" : \"\",    \"square\" : 32.0,    \"street\" : \"Тютчева\",    \"id\" : 123123,    \"state\" : \"Россия\",    \"region\" : \"Томская\",    \"apartment\" : 34  },  \"conclusionDate\" : \"2020-01-01\",  \"insuranceHolder\" : {    \"lastName\" : \"Иванов\",    \"firstName\" : \"Иван\",    \"middleName\" : \"Иванович\",    \"id\" : 123123,    \"passportSeries\" : \"1234\",    \"birthDate\" : \"YYYY-MM-DD\",    \"passportId\" : \"654321\"  },  \"validityPeriodTo\" : \"2020-03-01\",  \"contractNumber\" : 123123,  \"description\" : \"Договор страхования имущества\",  \"id\" : 123123}", ContractDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContractsResponseDto> getContracts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractsResponseDto>(objectMapper.readValue("{  \"contracts\" : [ {    \"calculatedDate\" : \"2020-01-01\",    \"insuranceAmount\" : 123123,    \"insurancePremium\" : 123123,    \"validityPeriodFrom\" : \"2020-01-01\",    \"insuranceObject\" : {      \"area\" : \"Советский\",      \"constructionYear\" : 2012,      \"housing\" : \"2\",      \"index\" : \"23452\",      \"type\" : \"Квартира\",      \"house\" : 3,      \"structure\" : \"\",      \"settlement\" : \"\",      \"square\" : 32.0,      \"street\" : \"Тютчева\",      \"id\" : 123123,      \"state\" : \"Россия\",      \"region\" : \"Томская\",      \"apartment\" : 34    },    \"conclusionDate\" : \"2020-01-01\",    \"insuranceHolder\" : {      \"lastName\" : \"Иванов\",      \"firstName\" : \"Иван\",      \"middleName\" : \"Иванович\",      \"id\" : 123123,      \"passportSeries\" : \"1234\",      \"birthDate\" : \"YYYY-MM-DD\",      \"passportId\" : \"654321\"    },    \"validityPeriodTo\" : \"2020-03-01\",    \"contractNumber\" : 123123,    \"description\" : \"Договор страхования имущества\",    \"id\" : 123123  }, {    \"calculatedDate\" : \"2020-01-01\",    \"insuranceAmount\" : 123123,    \"insurancePremium\" : 123123,    \"validityPeriodFrom\" : \"2020-01-01\",    \"insuranceObject\" : {      \"area\" : \"Советский\",      \"constructionYear\" : 2012,      \"housing\" : \"2\",      \"index\" : \"23452\",      \"type\" : \"Квартира\",      \"house\" : 3,      \"structure\" : \"\",      \"settlement\" : \"\",      \"square\" : 32.0,      \"street\" : \"Тютчева\",      \"id\" : 123123,      \"state\" : \"Россия\",      \"region\" : \"Томская\",      \"apartment\" : 34    },    \"conclusionDate\" : \"2020-01-01\",    \"insuranceHolder\" : {      \"lastName\" : \"Иванов\",      \"firstName\" : \"Иван\",      \"middleName\" : \"Иванович\",      \"id\" : 123123,      \"passportSeries\" : \"1234\",      \"birthDate\" : \"YYYY-MM-DD\",      \"passportId\" : \"654321\"    },    \"validityPeriodTo\" : \"2020-03-01\",    \"contractNumber\" : 123123,    \"description\" : \"Договор страхования имущества\",    \"id\" : 123123  } ]}", ContractsResponseDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractsResponseDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractsResponseDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContractDto> postContract(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContractCreateRequestDto contract) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractDto>(objectMapper.readValue("{  \"calculatedDate\" : \"2020-01-01\",  \"insuranceAmount\" : 123123,  \"insurancePremium\" : 123123,  \"validityPeriodFrom\" : \"2020-01-01\",  \"insuranceObject\" : {    \"area\" : \"Советский\",    \"constructionYear\" : 2012,    \"housing\" : \"2\",    \"index\" : \"23452\",    \"type\" : \"Квартира\",    \"house\" : 3,    \"structure\" : \"\",    \"settlement\" : \"\",    \"square\" : 32.0,    \"street\" : \"Тютчева\",    \"id\" : 123123,    \"state\" : \"Россия\",    \"region\" : \"Томская\",    \"apartment\" : 34  },  \"conclusionDate\" : \"2020-01-01\",  \"insuranceHolder\" : {    \"lastName\" : \"Иванов\",    \"firstName\" : \"Иван\",    \"middleName\" : \"Иванович\",    \"id\" : 123123,    \"passportSeries\" : \"1234\",    \"birthDate\" : \"YYYY-MM-DD\",    \"passportId\" : \"654321\"  },  \"validityPeriodTo\" : \"2020-03-01\",  \"contractNumber\" : 123123,  \"description\" : \"Договор страхования имущества\",  \"id\" : 123123}", ContractDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContractDto> putContract(@ApiParam(value = "Id of Contract",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContractUpdateRequestDto contract) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractDto>(objectMapper.readValue("{  \"calculatedDate\" : \"2020-01-01\",  \"insuranceAmount\" : 123123,  \"insurancePremium\" : 123123,  \"validityPeriodFrom\" : \"2020-01-01\",  \"insuranceObject\" : {    \"area\" : \"Советский\",    \"constructionYear\" : 2012,    \"housing\" : \"2\",    \"index\" : \"23452\",    \"type\" : \"Квартира\",    \"house\" : 3,    \"structure\" : \"\",    \"settlement\" : \"\",    \"square\" : 32.0,    \"street\" : \"Тютчева\",    \"id\" : 123123,    \"state\" : \"Россия\",    \"region\" : \"Томская\",    \"apartment\" : 34  },  \"conclusionDate\" : \"2020-01-01\",  \"insuranceHolder\" : {    \"lastName\" : \"Иванов\",    \"firstName\" : \"Иван\",    \"middleName\" : \"Иванович\",    \"id\" : 123123,    \"passportSeries\" : \"1234\",    \"birthDate\" : \"YYYY-MM-DD\",    \"passportId\" : \"654321\"  },  \"validityPeriodTo\" : \"2020-03-01\",  \"contractNumber\" : 123123,  \"description\" : \"Договор страхования имущества\",  \"id\" : 123123}", ContractDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
