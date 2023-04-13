package is.hi.hbv501g.hbv1.Persistence.Repositories;

import is.hi.hbv501g.hbv1.Persistence.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 *  Repository of Children
 */
public interface ChildRepository extends JpaRepository<Child, Long> {
    Child save(Child child);
    void delete(Child child);
    List<Child> findByParent(Parent parent);
    List<Child> findByDaycareWorker(DaycareWorker daycareWorker);

    @Query("SELECT c FROM Child c WHERE c.daycareWorker IS NULL AND c.parent = :parent")
    List<Child> getUnregisteredChildrenByParent(@Param("parent") Parent parent);
    Child findChildById(Long id);
}
