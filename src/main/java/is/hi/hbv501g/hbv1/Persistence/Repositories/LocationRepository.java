package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository of Locations
 */
public interface LocationRepository extends JpaRepository <Location, Long> {
    Location save(Location location);
    List<Location> findByLocationCode(String locationCode);
    List<Location> findAll();
}
