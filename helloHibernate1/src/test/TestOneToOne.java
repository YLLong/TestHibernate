package test;

import com.uiyllong.beans.Detail;
import com.uiyllong.beans.Login;
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
public class TestOneToOne {

    Configuration configuration = null;
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction ts = null;

    /**
     * 一对一的唯一外键方式。实例中savage必须是person，不能换成 room ,换成room 后 person的值insert不了 person中配置了唯一约束
     */
    @Test
    public void  demo2() {
        ts =session.beginTransaction();
        Person person = new Person();
        person.setName("xiaomi");
        Room room = new Room();
        room.setAddress("102");
        person.setRoom(room);
        session.save(person);
        ts.commit();
    }

    /**
     * 这是一对一中共享主键的方式，将一个表中的主键当外键使用
     */
    @Test
    public void demo() {
        ts = session.beginTransaction();
        Login login = new Login();
        Detail detail = new Detail();
        login.setUsername("uilong");
        login.setPassword("10601");
        detail.setTruename("淋珑");
        detail.setLogin(login);
        login.setDetail(detail);
        session.save(detail);
        ts.commit();
    }

    @Before
    public void getConn() {
        configuration = new Configuration().configure().addClass(Login.class).addClass(Detail.class).addClass(Person.class).addClass(Room.class);
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();

    }

    @After
    public void getClose() {
        session.close();
        sessionFactory.close();
    }

}
