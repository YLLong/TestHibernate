package test;

import com.uiyllong.beans.Course;
import com.uiyllong.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by uilong on 2016/5/21.
 */
public class TestManyToMany {

    Configuration configuration = null;
    SessionFactory sessionFactory = null;
    Session session = null;
    Transaction ts = null;

    /**
     * 多对多单向关联
     */
    @Test
    public void demo() {
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        course1.setCnumber("1011");
        course1.setCname("AAA");
        course2.setCnumber("1022");
        course2.setCname("BBB");
        course3.setCnumber("1033");
        course3.setCname("CCC");
        Set courses = new HashSet();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        Student student = new Student();
        student.setSnumber("12212");
        student.setSname("张三");
        student.setSage(24);
        student.setCourses(courses);
        session.save(student);
    }

    @Before
    public void getConn() {
        configuration = new Configuration().configure().addClass(Student.class).addClass(Course.class);
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
