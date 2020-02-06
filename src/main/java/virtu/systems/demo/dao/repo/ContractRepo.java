package virtu.systems.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import virtu.systems.demo.dao.entity.Contract;


@Repository
public interface ContractRepo
        extends JpaRepository<Contract, Long> {

}
