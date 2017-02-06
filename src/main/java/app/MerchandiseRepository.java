package app;

import app.model.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by bailey on 2/4/2017.
 */
@Repository
public interface MerchandiseRepository extends JpaRepository<Merchandise, UUID> {

}
