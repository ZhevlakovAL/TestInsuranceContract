package virtu.systems.demo.api;

import virtu.systems.demo.api.dto.InsuranceHolderDto;
import virtu.systems.demo.api.dto.InsuranceHolderRequestDto;
import virtu.systems.demo.api.dto.InsuranceHoldersResponseDto;
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
import virtu.systems.demo.svc.InsuranceHolderSvc;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.io.IOException;
import java.util.List;

@Api(tags = "InsuranceHolder")
@Controller
public class InsuranceHolderApiController implements InsuranceHolderApi {

    private static final Logger log = LoggerFactory.getLogger(InsuranceHolderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final InsuranceHolderSvc service;

    @org.springframework.beans.factory.annotation.Autowired
    public InsuranceHolderApiController(
            final ObjectMapper objectMapper,
            final HttpServletRequest request,
            final InsuranceHolderSvc insuranceHolderSvc
    ) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.service = insuranceHolderSvc;
    }

    public ResponseEntity<InsuranceHolderDto> deleteInsuranceHolderById(@ApiParam(value = "Id of insuranceHolder",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InsuranceHolderDto>(objectMapper.readValue("{  \"lastName\" : \"Иванов\",  \"firstName\" : \"Иван\",  \"middleName\" : \"Иванович\",  \"id\" : 123123,  \"passportSeries\" : \"1234\",  \"birthDate\" : \"YYYY-MM-DD\",  \"passportId\" : \"654321\"}", InsuranceHolderDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InsuranceHolderDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InsuranceHolderDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InsuranceHolderDto> getInsuranceHolderById(@ApiParam(value = "Id of insuranceHolder",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InsuranceHolderDto>(objectMapper.readValue("{  \"lastName\" : \"Иванов\",  \"firstName\" : \"Иван\",  \"middleName\" : \"Иванович\",  \"id\" : 123123,  \"passportSeries\" : \"1234\",  \"birthDate\" : \"YYYY-MM-DD\",  \"passportId\" : \"654321\"}", InsuranceHolderDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InsuranceHolderDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InsuranceHolderDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InsuranceHoldersResponseDto> getInsuranceHolders(@ApiParam(value = "") @Valid @RequestParam(value = "lastName", required = false) Optional<String> lastName,@ApiParam(value = "") @Valid @RequestParam(value = "firstName", required = false) Optional<String> firstName,@ApiParam(value = "") @Valid @RequestParam(value = "middleName", required = false) Optional<String> middleName,@ApiParam(value = "") @Valid @RequestParam(value = "passportSeries", required = false) Optional<String> passportSeries,@ApiParam(value = "") @Valid @RequestParam(value = "passportId", required = false) Optional<String> passportId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return ResponseEntity.ok(service.getAll());
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InsuranceHoldersResponseDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InsuranceHoldersResponseDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InsuranceHolderDto> postInsuranceHolder(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InsuranceHolderRequestDto insuranceHolder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return ResponseEntity.ok(service.add(insuranceHolder));
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InsuranceHolderDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InsuranceHolderDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InsuranceHolderDto> putInsuranceHolder(@ApiParam(value = "Id of insuranceHolder",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InsuranceHolderRequestDto insuranceHolder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InsuranceHolderDto>(objectMapper.readValue("{  \"lastName\" : \"Иванов\",  \"firstName\" : \"Иван\",  \"middleName\" : \"Иванович\",  \"id\" : 123123,  \"passportSeries\" : \"1234\",  \"birthDate\" : \"YYYY-MM-DD\",  \"passportId\" : \"654321\"}", InsuranceHolderDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InsuranceHolderDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InsuranceHolderDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
