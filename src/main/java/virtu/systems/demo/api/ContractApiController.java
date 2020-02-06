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
import virtu.systems.demo.svc.ContractSvc;
import virtu.systems.demo.svc.InsuranceHolderSvc;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.io.IOException;
import java.util.List;

@Api(tags = "Contract")
@Controller
public class ContractApiController implements ContractApi {

    private final ContractSvc service;

    public ContractApiController(ContractSvc contractSvc) {
        this.service = contractSvc;
    }

    public ResponseEntity<ContractDto> getContractById(final Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    public ResponseEntity<ContractsResponseDto> getContracts() {
        return ResponseEntity.ok(service.getAll());
    }

    public ResponseEntity<ContractDto> postContract(final ContractCreateRequestDto contract) {
        return ResponseEntity.ok(service.add(contract));
    }

        //TODO: объединить DTO для создания и редактирования договора
    public ResponseEntity<ContractDto> putContract(final Long id, final ContractUpdateRequestDto contract) {
        return ResponseEntity.ok(service.update(contract));
    }

}
