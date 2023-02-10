package is.hi.hbv501g.hbv1.Services;

import is.hi.hbv501g.hbv1.Persistence.Entities.*;
import java.util.List;

/**
 * Interface definitions for the ParentService.
 */
public interface ParentService {
    List<Parent> findAll();
    Parent findParentById(Long id);
    Parent findParentByEmail(String email);
    Parent save(Parent parent);
    void delete(Parent parent);
    Child addChild(Child child);
    Parent findParentByAuth0Id(String id);
    boolean findBySsn(String ssn);
}
