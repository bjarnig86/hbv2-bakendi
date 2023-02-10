package is.hi.hbv501g.hbv1.Persistence.DTOs;

/**
 * Helper Object for working with request bodies for daycareworkcer Applications
 */

public class ApplicationDTO {
    private Long id;
    private Long daycareWorkerId;
    private Long parentId;
    private Long childId;

    public ApplicationDTO(Long daycareWorkerId, Long parentId, Long childId) {
        this.daycareWorkerId = daycareWorkerId;
        this.parentId = parentId;
        this.childId = childId;
    }

    public Long getDaycareWorkerId() {
        return daycareWorkerId;
    }
    public void setDaycareWorkerId(Long daycareWorkerId) {
        this.daycareWorkerId = daycareWorkerId;
    }
    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getChildId() {
        return childId;
    }
}
