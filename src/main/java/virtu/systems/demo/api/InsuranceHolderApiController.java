package virtu.systems.demo.api;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import virtu.systems.demo.api.dto.InsuranceHolderDto;
import virtu.systems.demo.api.dto.InsuranceHolderRequestDto;
import virtu.systems.demo.api.dto.InsuranceHoldersResponseDto;
import virtu.systems.demo.svc.InsuranceHolderSvc;

import java.util.Optional;

@Api(tags = "InsuranceHolder")
@Controller
public class InsuranceHolderApiController implements InsuranceHolderApi {

    private final InsuranceHolderSvc service;

    public InsuranceHolderApiController(
            final InsuranceHolderSvc insuranceHolderSvc
    ) {
        this.service = insuranceHolderSvc;
    }

    @Override
    public ResponseEntity<InsuranceHolderDto> deleteInsuranceHolderById(final Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @Override
    public ResponseEntity<InsuranceHolderDto> getInsuranceHolderById(final Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @Override
    public ResponseEntity<InsuranceHoldersResponseDto> getInsuranceHolders(
            final Optional<String> lastName,
            final Optional<String> firstName,
            final Optional<String> middleName,
            final Optional<String> passportSeries,
            final Optional<String> passportId) {
        return ResponseEntity.ok(service.getAll());
    }

    @Override
    public ResponseEntity<InsuranceHolderDto> postInsuranceHolder(final InsuranceHolderRequestDto insuranceHolder) {
        return ResponseEntity.ok(service.add(insuranceHolder));
    }

    @Override
    public ResponseEntity<InsuranceHolderDto> putInsuranceHolder(
            final Long id,
            final InsuranceHolderRequestDto insuranceHolder) {
        return ResponseEntity.ok(service.update(id, insuranceHolder));
    }

}
