package is.hi.hbv501g.hbv1.Persistence.Entities;

import javax.persistence.*;

/**
 * Application entitie. Table: "applications".
 * Used to apply for a spot with a daycareworker
 */

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long daycareWorkerId;
    private Long parentId;
    private Long childId;

    public Application() {

    }
    public Application(Long daycareWorkerId, Long parentId, Long childId) {
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

    public void setChildId(Long childId) {
        this.childId = childId;
    }
}
