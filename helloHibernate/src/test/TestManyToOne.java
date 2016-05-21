package test;

import com.uiyllong.javabean.Customer;
import com.uiyllong.javabean.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by uilong on 2016/5/21.
 */
public class TestManyToOne {

    private SessionFactory factory=new Configuration()
            .addClass(Customer.class)
            .addClass(Order.class)
            .configure().buildSessionFactory();
    @Test
    public void demo1(){
        Session session=factory.openSession();
        session.beginTransaction();
        Customer customer=new Customer();
        customer.setCname("fuck");
        Order order=new Order();
        order.setPrice("11");
        order.setCustomer(customer);

        session.save(order);

        session.getTransaction().commit();
        session.close();

    }
}
