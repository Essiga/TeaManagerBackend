package tm.teamanager.infrastructure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import tm.teamanager.domain.Tea;
import tm.teamanager.infrastructure.api.ITeaRepository;

import java.util.List;

@Component
public class TeaRepository implements ITeaRepository {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Tea> getAllTeas() {
        TypedQuery query = em.createQuery("FROM Tea", Tea.class);
        return query.getResultList();
    }
}
