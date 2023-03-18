package is.hi.hbv501g.hbv1.Persistence.Simpletons;

import is.hi.hbv501g.hbv1.Persistence.Entities.DaycareWorker;

/**
 * Simplyfied Daycare Worker Object to be used for client side.
 */
public class SimpleDCW {
    private Long id;
    private String fullName;
    private String email;
    private String address;
    private String location;
    private String locationCode;
    private String mobile;
    private int freeSpots;
    private int experienceInYears;

    public SimpleDCW(Long id, String fullName, String email, String address, String location, String locationCode, String mobile, int freeSpots, int experienceInYears) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.location = location;
        this.locationCode = locationCode;
        this.mobile = mobile;
        this.freeSpots = freeSpots;
        this.experienceInYears = experienceInYears;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public int getFreeSpots() {
        return freeSpots;
    }

    public void setFreeSpots(int freeSpots) {
        this.freeSpots = freeSpots;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    /**
     * Static method for creating a simple version of DaycareWorker.
     * Used to filter out vulnerable data.
     * @param dcw An unfiltered DaycareWorker object.
     * @return Simplyfied DaycareWorker object.
     */
    public static SimpleDCW createSimpleDCW(DaycareWorker dcw) {
        SimpleDCW simple = new SimpleDCW(
                dcw.getId(),
                dcw.getFullName(),
                dcw.getEmail(),
                dcw.getAddress(),
                dcw.getLocation(),
                dcw.getLocationCode(),
                dcw.getMobile(),
                dcw.getFreeSpots(),
                dcw.getExperienceInYears()
        );
        return simple;
    }
}
