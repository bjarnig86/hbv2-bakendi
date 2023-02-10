package is.hi.hbv501g.hbv1.Services.Implementation;

import is.hi.hbv501g.hbv1.Persistence.Entities.Location;
import is.hi.hbv501g.hbv1.Persistence.Repositories.LocationRepository;
import is.hi.hbv501g.hbv1.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * Service for routes that handle Locations.  Uses the Location Repository.
 */
@Service
public class LocationServiceImplementation implements LocationService {
    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImplementation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findByLocationCode(String locationCode) {
        return locationRepository.findByLocationCode(locationCode);
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location addLocation(Location location) {
        locationRepository.save(location);
        return location;
    }

}
