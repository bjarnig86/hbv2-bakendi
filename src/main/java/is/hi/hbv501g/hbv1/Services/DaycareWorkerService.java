package is.hi.hbv501g.hbv1.Services;

import is.hi.hbv501g.hbv1.Persistence.Entities.Application;
import is.hi.hbv501g.hbv1.Persistence.Entities.DayReport;
import is.hi.hbv501g.hbv1.Persistence.Entities.Alert;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;
import java.util.List;

/**
 * Interface definitions for the DaycareWorkerService.
 */
public interface DaycareWorkerService {
    List<DaycareWorker> findByLocation(String location);
    List<DaycareWorker> findByLocationCode(String locationCode);
    DaycareWorker findDaycareWorkerById(Long id);
    boolean findDaycareWorkerBySsn(String ssn);
    DaycareWorker findDaycareWorkerByEmail(String email);
    List<DaycareWorker> findAll();
    DaycareWorker addDaycareWorker(DaycareWorker daycareWorker);
    DayReport createDayReport(DayReport dayReport);
    Application applyForDaycareWorker(Application application);
    void delete(DaycareWorker daycareWorker);
    Alert createAlert(Alert alert);
}


