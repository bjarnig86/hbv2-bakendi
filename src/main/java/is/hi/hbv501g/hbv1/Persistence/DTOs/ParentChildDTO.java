package is.hi.hbv501g.hbv1.Persistence.DTOs;

/**
 * Helper Object for working with request bodies for child insertions
 */

public class ParentChildDTO {
    private String ssn;
    private String firstName;
    private String lastName;
    private Long parentId;

    public ParentChildDTO(String ssn, String firstName, String lastName, Long parentId) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentId = parentId;
    }

    public ParentChildDTO() {
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getParentId() {
        return parentId;
    }
}
