package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/**
 *  Repository of Children
 */
public interface ChildRepository extends JpaRepository<Child, Long> {
    Child save(Child child);
    void delete(Child child);
    List<Child> findByParent(Parent parent);
    List<Child> findByDaycareWorker(DaycareWorker daycareWorker);
    Child findChildById(Long id);
}
