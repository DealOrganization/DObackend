package DealOrganization.backend.Deal;

import java.util.Optional;

public interface DealRepository {
    void save(Deal deal);
    Optional<Deal> findById(int id);
}
