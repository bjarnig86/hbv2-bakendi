package is.hi.hbv501g.hbv1.Persistence.DTOs;

import is.hi.hbv501g.hbv1.Persistence.Entities.Severity;

import java.time.LocalDateTime;

/**
 * Helper Object for working with request bodies for alerts
 */

public class AlertDTO {
    private LocalDateTime timestamp;
    private Severity severity;
    private String title;
    private String description;
    private Long dcwId;
    private Long childId;

    public AlertDTO(LocalDateTime timeStamp, Severity severity, String title, String description, Long dcwId, Long childId) {
        this.timestamp = timeStamp;
        this.severity = severity;
        this.title = title;
        this.description = description;
        this.dcwId = dcwId;
        this.childId = childId;

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDcwId() {
        return dcwId;
    }

    public void setDcwId(Long dcwId) {
        this.dcwId = dcwId;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }
}
