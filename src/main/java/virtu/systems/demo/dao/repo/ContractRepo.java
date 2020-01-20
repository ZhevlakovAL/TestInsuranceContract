package virtu.systems.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import virtu.systems.demo.dao.entity.Contract;

import java.util.UUID;


@Repository
public interface ContractRepo
        extends JpaRepository<Contract, UUID>,
        JpaSpecificationExecutor<Contract> {

}
