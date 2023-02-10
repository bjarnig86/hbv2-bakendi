package is.hi.hbv501g.hbv1.Persistence.Entities;

import javax.persistence.*;

/**
 * Location entitie. Table: "locations".
 * Used for daycareworker locations
 */

@Entity
@Table(name= "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String locationCode;
    private String locationName;

    public Location() {

    }
    public Location(
            String locationCode,
            String locationName
    ) {
        this.locationCode = locationCode;
        this.locationName = locationName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocation(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
}

