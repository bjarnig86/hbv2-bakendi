package is.hi.hbv501g.hbv1.Services;
import is.hi.hbv501g.hbv1.Persistence.Entities.Location;
import java.util.List;

/**
 * Interface definitions for the LocationService.
 */
public interface LocationService {
    List<Location> findByLocationCode(String locationCode);
    List<Location> findAll();
    Location addLocation(Location location);
}
