package is.hi.hbv501g.hbv1.Persistence.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * <pre>
 * Child entity. Table: "children"
 * Relations:
 * * ManyToOne with the daycareworkers table
 * * ManyToOne with the parents table
 * * OneToMany with the dayreports table
 * </pre>
 */
@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String ssn;

    private String firstName;
    private String lastName;
    private LocalDate sicknessDay;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonBackReference
    private DaycareWorker daycareWorker;

    @JsonProperty("dcwName")
    @Nullable
    public String getDaycareWorkerName() {
        DaycareWorker daycareWorker = this.getDaycareWorker();
        return daycareWorker != null ? daycareWorker.getFullName() : null;
    }

    @JsonProperty("dcwEmail")
    @Nullable
    public String getDaycareWorkerEmail() {
        DaycareWorker daycareWorker = this.getDaycareWorker();
        return daycareWorker != null ? daycareWorker.getEmail() : null;
    }

    @JsonProperty("dcwMobile")
    @Nullable
    public String getDaycareWorkerMobile() {
        DaycareWorker daycareWorker = this.getDaycareWorker();
        return daycareWorker != null ? daycareWorker.getMobile() : null;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Parent parent;

    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<DayReport> dayReports = new ArrayList<>();

    public Child() {
    }

    public Child(
            String ssn,
            String firstName,
            String lastName
    ) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDayReports(List<DayReport> dayReports) {
        this.dayReports = dayReports;
    }

    public List<DayReport> getDayReports() {
        return dayReports;
    }

    public void addDayReport(DayReport dayReport) {
        this.dayReports.add(dayReport);
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

    public DaycareWorker getDaycareWorker() {
        return daycareWorker;
    }

    public void setDaycareWorker(DaycareWorker dcw) {
        this.daycareWorker = dcw;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public LocalDate getSicknessDay() {
        return sicknessDay;
    }

    public void setSicknessDay(LocalDate sicknessDay) {
        this.sicknessDay = sicknessDay;
    }
}


