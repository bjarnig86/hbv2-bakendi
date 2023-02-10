package is.hi.hbv501g.hbv1.Persistence.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * Alert entity. Table: "alerts"
 * An object used to send alerts from DaycareWorker to Parent.
 */
@Entity
@Table(name = "alerts")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestamp;
    private Severity severity;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private DaycareWorker daycareWorker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Child child;

    public Alert() {
    }

    public Alert(
            LocalDateTime timestamp,
            Severity severity,
            String description,
            DaycareWorker daycareWorker,
            Child child) {
        this.timestamp = timestamp;
        this.severity = severity;
        this.description = description;
        this.daycareWorker = daycareWorker;
        this.child = child;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public DaycareWorker getDaycareWorker() {
        return daycareWorker;
    }

    public void setDaycareWorker(DaycareWorker daycareWorker) {
        this.daycareWorker = daycareWorker;
    }
}
