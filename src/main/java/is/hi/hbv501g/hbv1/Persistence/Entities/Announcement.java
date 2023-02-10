package is.hi.hbv501g.hbv1.Persistence.Entities;


import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * Announcement entitie.  Used to give general information from Daycare Worker to all parents.
 */
@Entity
@Table(name= "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timestamp;
    private String title;
    private String announcement;

    public Announcement() {
    }

    public Announcement(LocalDateTime timestamp, String title, String announcement) {
        this.timestamp = timestamp;
        this.title = title;
        this.announcement = announcement;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }
}
