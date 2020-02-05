package virtu.systems.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import virtu.systems.demo.dao.entity.InsuranceHolder;

import java.util.UUID;


@Repository
public interface InsuranceHolderRepo
        extends JpaRepository<InsuranceHolder, Long>,
        JpaSpecificationExecutor<InsuranceHolder> {

}
