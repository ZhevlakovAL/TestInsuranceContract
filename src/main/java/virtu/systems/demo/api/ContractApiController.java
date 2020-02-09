package virtu.systems.demo.api;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.svc.ContractSvc;

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

    public ResponseEntity<ContractDto> putContract(final ContractUpdateRequestDto contract) {
        return ResponseEntity.ok(service.update(contract));
    }

}
