package test;

import com.uiyllong.beans.Person;
import com.uiyllong.beans.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by uilong on 2016/5/21.
 */
public class TestManyToOne {

    Configuration configuration = null;
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction ts = null;

    /**
     * 一对多双向关联
     */
    @Test
    public void demo1() {
        Person person1 = new Person();
        Person person2 = new Person();
        Room room = new Room();
        person1.setName("lisi");
        person2.setName("wanger");
        room.setAddress("110");
        person1.setRoom(room);
        person2.setRoom(room);
        room.getPerson().add(person1);
        room.getPerson().add(person2);
        session.save(room);
        session.save(person1);
        session.save(person2);
    }

    /**
     *多对一单向关联
     */
    @Test
    public void demo() {
        Person person = new Person();
        person.setName("uilong");
        Room room = new Room();
        room.setAddress("106");
        person.setRoom(room);
        session.save(person);
    }

    @Before
    public void getConn() {
        configuration = new Configuration().configure().addClass(Person.class).addClass(Room.class);
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        ts = session.beginTransaction();
    }

    @After
    public void getClose() {
        ts.commit();
        session.close();
        sessionFactory.close();
    }

}
