package is.hi.hbv501g.hbv1.Services.Implementation;

import is.hi.hbv501g.hbv1.Persistence.Entities.Child;
import is.hi.hbv501g.hbv1.Persistence.Entities.DayReport;
import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;
import is.hi.hbv501g.hbv1.Persistence.Entities.Parent;
import is.hi.hbv501g.hbv1.Persistence.Repositories.ChildRepository;
import is.hi.hbv501g.hbv1.Persistence.Repositories.DayReportRepository;
import is.hi.hbv501g.hbv1.Services.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;


/**
 * Service used by routes that handle Children.  It uses the ChildRepository.
 */
@Service
public class ChildServiceImplementation implements ChildService {
    private ChildRepository childRepository;
    private DayReportRepository dayReportRepository;


    @Autowired
    public ChildServiceImplementation(ChildRepository childRepository, DayReportRepository dayReportRepository) {
        this.childRepository = childRepository;
        this.dayReportRepository = dayReportRepository;
    }

    @Override
    public Child save(Child child) {
        return childRepository.save(child);
    }

    @Override
    public void delete(Child child) {
        childRepository.delete(child);
    }

    @Override
    public List<Child> findByParents(Parent parent) {
        return childRepository.findByParent(parent);
    }

    @Override
    public DayReport findByChild(Child child) {
        List<DayReport> dayReports =  dayReportRepository.findByChild(child);
        for (DayReport dayReport : dayReports) {
            System.out.println(LocalDate.now()+ " "+ dayReport.getDate());
            if (LocalDate.now().equals(dayReport.getDate())){
                return dayReport;
            } 
        }
        return null;
    }

    @Override
    public List<DayReport> getAllDayReportsByChild(Child child) {
        List<DayReport> dayReports = dayReportRepository.findByChild(child);
        return dayReports;
    }

    @Override
    public List<Child> findByDaycareWorker(DaycareWorker daycareWorker) {
        return childRepository.findByDaycareWorker(daycareWorker);
    }
    @Override
    public Child findChildById(Long id) {
        return childRepository.findChildById(id);
    }

    @Override
    public List<Child> getUnregisteredChildrenByParent(Parent parent) {
        return childRepository.getUnregisteredChildrenByParent(parent);
    }
}
