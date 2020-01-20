package virtu.systems.demo.api;

import virtu.systems.demo.api.dto.CalculateInsurancePremiumRequestDto;
import virtu.systems.demo.api.dto.CalculateInsurancePremiumResponseDto;
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

@Api(tags = "Calculate")
@Controller
public class CalculateApiController implements CalculateApi {

    private static final Logger log = LoggerFactory.getLogger(CalculateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CalculateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CalculateInsurancePremiumResponseDto> calculateInsurancePremium(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CalculateInsurancePremiumRequestDto contract) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CalculateInsurancePremiumResponseDto>(objectMapper.readValue("{  \"calculatedDate\" : \"2020-01-01\",  \"insuranceAmount\" : 123123,  \"square\" : 32.0,  \"insurancePremium\" : 123123,  \"validityPeriodFrom\" : \"2020-01-01\",  \"constructionYear\" : 2012,  \"validityPeriodTo\" : \"2020-03-01\",  \"type\" : \"Квартира\"}", CalculateInsurancePremiumResponseDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CalculateInsurancePremiumResponseDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CalculateInsurancePremiumResponseDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
