package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Repository of Applications
 */

public interface DaycareWorkerApplicationRepository extends JpaRepository<Application, Long> {
    Application save(Application application);

}
