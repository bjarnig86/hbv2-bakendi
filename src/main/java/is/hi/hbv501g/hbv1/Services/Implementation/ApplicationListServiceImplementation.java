package is.hi.hbv501g.hbv1.Services.Implementation;
import is.hi.hbv501g.hbv1.Services.ApplicationListService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import is.hi.hbv501g.hbv1.Persistence.Entities.Child;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;

@Service
public class ApplicationListServiceImplementation implements ApplicationListService {
    public List<Child> getApplicationList(DaycareWorker dcw) {
        List<Child> list = new ArrayList<Child>();
        return list;
    }
    
}
