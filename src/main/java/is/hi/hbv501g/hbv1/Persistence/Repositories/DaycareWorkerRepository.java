package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

/**
 *  Repository of Daycare Workers
 */
public interface DaycareWorkerRepository extends JpaRepository <DaycareWorker, Long> {
    DaycareWorker save(DaycareWorker daycareWorker);
    DaycareWorker findDaycareWorkerById(Long id);
    Optional<DaycareWorker> findDaycareWorkerBySsn(String ssn);
    DaycareWorker findDaycareWorkerByEmail(String email);
    List<DaycareWorker> findByLocation(String location);
    List<DaycareWorker> findByLocationCode(String locationCode);
    List<DaycareWorker> findAll();
    void delete(DaycareWorker daycareWorker);

}

