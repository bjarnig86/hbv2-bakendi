package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Repository of Alerts
 */
public interface AlertRepository extends JpaRepository<Alert, Long> {
    Alert save(Alert alert);
}
