package is.hi.hbv501g.hbv1.Services;

import java.util.List;
import is.hi.hbv501g.hbv1.Persistence.Entities.Child;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;

public interface ApplicationListService {
    List<Child> getApplicationList(DaycareWorker dcw);
}
