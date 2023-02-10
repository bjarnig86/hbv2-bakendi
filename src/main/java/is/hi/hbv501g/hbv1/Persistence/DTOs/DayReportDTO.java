package is.hi.hbv501g.hbv1.Persistence.DTOs;

import is.hi.hbv501g.hbv1.Persistence.Entities.Appetite;

import java.time.LocalDateTime;

/**
 * Helper Object for working with request bodies for dayreports
 */
public class DayReportDTO {
    private LocalDateTime sleepFrom;
    private LocalDateTime sleepTo;
    private Appetite appetite;
    private String comment;
    private Long dcwId;
    private Long childId;

    public DayReportDTO(LocalDateTime sleepFrom, LocalDateTime sleepTo, Appetite appetite, String comment, Long dcwId, Long childId) {
        this.sleepFrom = sleepFrom;
        this.sleepTo = sleepTo;
        this.appetite = appetite;
        this.comment = comment;
        this.dcwId = dcwId;
        this.childId = childId;
    }

    public LocalDateTime getSleepFrom() {
        return sleepFrom;
    }

    public void setSleepFrom(LocalDateTime sleepFrom) {
        this.sleepFrom = sleepFrom;
    }

    public LocalDateTime getSleepTo() {
        return sleepTo;
    }

    public void setSleepTo(LocalDateTime sleepTo) {
        this.sleepTo = sleepTo;
    }

    public Appetite getAppetite() {
        return appetite;
    }

    public void setAppetite(Appetite appetite) {
        this.appetite = appetite;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
