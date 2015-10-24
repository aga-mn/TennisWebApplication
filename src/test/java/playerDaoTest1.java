/**
 * Created by adam on 26.04.15.
 */
import com.tennis.model.Club;
import com.tennis.model.Player;
import com.tennis.model.PlayerProfile;
import com.tennis.model.PlayerRanking;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "file:src/main/webapp/WEB-INF/dataSource-context.xml",
        "file:src/main/webapp/WEB-INF/persistance-context.xml"
}
)
@Repository
@Transactional
public class playerDaoTest1 {

    @Autowired
    private SessionFactory sessionFactory;



    @Before
    public void before() {


    }

    @Test
    public void addToDB() {





        // create the objects needed for testing
        Player pl=new Player();
        pl.setLastName("Nadal");
        pl.setFirstName("Rafa");
        pl.setUsername("rafal");




        // storing the objects for the test in the database
        sessionFactory.getCurrentSession().save(pl);
        sessionFactory.getCurrentSession().delete(pl);
        assertNotNull(pl);



    }

    @After
    public void after() {

    }
}
