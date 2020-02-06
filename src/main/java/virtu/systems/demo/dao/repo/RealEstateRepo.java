package virtu.systems.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import virtu.systems.demo.dao.entity.RealEstate;


@Repository
public interface RealEstateRepo
        extends JpaRepository<RealEstate, Long>,
        JpaSpecificationExecutor<RealEstate> {

}
