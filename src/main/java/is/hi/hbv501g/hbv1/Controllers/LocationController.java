package is.hi.hbv501g.hbv1.Controllers;

import is.hi.hbv501g.hbv1.Persistence.Entities.Location;
import is.hi.hbv501g.hbv1.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for Location logic.
 */

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class LocationController {
    @Autowired
    private LocationService locationService;

    /**
     * GET on /locations
     * @param locationCode the locations
     * @return List af all locations
     */
    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocations(@RequestParam(required = false) String locationCode) {
        try {
            List<Location> locations = new ArrayList<Location>();

            if (locationCode == null)
                locationService.findAll().forEach(locations::add);
            else
                locationService.findByLocationCode(locationCode).forEach(locations::add);

            if (locations.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(locations, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * POST on /addlocation
     * @param location the location to add
     * @return location added
     */
    @PostMapping("/addlocation")
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        System.out.println(location.getLocationName() + " " + location.getLocationCode());
        try {
            locationService.addLocation(location);

            if (location == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(location, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
