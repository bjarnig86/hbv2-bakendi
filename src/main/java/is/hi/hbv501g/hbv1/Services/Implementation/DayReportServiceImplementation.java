package is.hi.hbv501g.hbv1.Services.Implementation;

import is.hi.hbv501g.hbv1.Persistence.Entities.DayReport;
import is.hi.hbv501g.hbv1.Persistence.Repositories.DayReportRepository;
import is.hi.hbv501g.hbv1.Services.DayReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The main service used by routes that handle Day Reports. It uses the DayReport repository.
 */
@Service
public class DayReportServiceImplementation implements DayReportService {
    private DayReportRepository dayReportRepository;

    @Autowired
    public DayReportServiceImplementation(DayReportRepository dayReportRepository) {
        this.dayReportRepository = dayReportRepository;
    }

    @Override
    public void delete(DayReport dayReport) {
        dayReportRepository.delete(dayReport);
    };
}
