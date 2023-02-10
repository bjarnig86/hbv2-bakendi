package is.hi.hbv501g.hbv1.Services;

import is.hi.hbv501g.hbv1.Persistence.Entities.Child;
import is.hi.hbv501g.hbv1.Persistence.Entities.DayReport;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;
import is.hi.hbv501g.hbv1.Persistence.Entities.Parent;
import java.util.List;


/**
 * Interface definitions for the ChildService.
 */
public interface ChildService {
    Child save(Child child);
    void delete(Child child);
    List<Child> findByParents(Parent parent);
    List<Child> findByDaycareWorker(DaycareWorker daycareWorker);
    Child findChildById(Long id);
    DayReport findByChild(Child child);
    List<DayReport> getAllDayReportsByChild(Child child);
}
