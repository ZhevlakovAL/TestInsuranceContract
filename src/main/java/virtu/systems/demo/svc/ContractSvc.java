package virtu.systems.demo.svc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import virtu.systems.demo.api.dto.ContractCreateRequestDto;
import virtu.systems.demo.api.dto.ContractDto;
import virtu.systems.demo.api.dto.ContractUpdateRequestDto;
import virtu.systems.demo.api.dto.ContractsResponseDto;
import virtu.systems.demo.dao.entity.Contract;
import virtu.systems.demo.dao.repo.ContractRepo;
import virtu.systems.demo.map.ContractMapper;

import java.util.function.Function;

@Slf4j
@Service
public class ContractSvc {

    private ContractRepo repo;

    public ContractSvc(final ContractRepo repo) {
        this.repo = repo;
    }

    public ContractDto get(final Long id) {
        return Function.<Long>identity()
                .andThen(this::getById)
                .andThen(ContractMapper.INSTANCE::toDto)
                .apply(id);
    }

    private Contract getById(final Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("unknown Id %d", id)));
    }

    public ContractsResponseDto getAll() {
        return ContractMapper.INSTANCE.toResponse(repo.findAll());
    }

    @Transactional
    public ContractDto add(
            final ContractCreateRequestDto createRequestDto
    ) {
        return Function.<ContractCreateRequestDto>identity()
                .andThen(ContractMapper.INSTANCE::toDao)
                .andThen(x -> repo.save(x))
                .andThen(ContractMapper.INSTANCE::toDto)
                .apply(createRequestDto);
    }

    @Transactional
    public ContractDto update(
            final ContractUpdateRequestDto updateRequestDto) {
        getById(updateRequestDto.getId());
        return Function.<ContractUpdateRequestDto>identity()
                .andThen(ContractMapper.INSTANCE::toDao)
                .andThen(x -> repo.save(x))
                .andThen(ContractMapper.INSTANCE::toDto)
                .apply(updateRequestDto);
    }

}
