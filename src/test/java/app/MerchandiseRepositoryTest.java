package app;

import app.model.Merchandise;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by bailey on 2/4/2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class MerchandiseRepositoryTest {

    @Autowired
    private MerchandiseRepository merchandiseRepository;

    @Test
    public void testCreate() {
        Merchandise merchandise = new Merchandise();
        merchandise.setName("Hello!");
        merchandise = merchandiseRepository.save(merchandise);
        Assert.assertNotNull(merchandise.getId());

        Merchandise retrieved = merchandiseRepository.findOne(merchandise.getId());
        Assert.assertEquals(retrieved.getName(), merchandise.getName());
    }
}
