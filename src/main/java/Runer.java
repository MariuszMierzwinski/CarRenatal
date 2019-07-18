import DAO.Car;
import org.hibernate.Session;

public class Runer {
    public static void main(String[] args) {
        Session session = new HibernateFactory().getSessionFactory().openSession();
        session.beginTransaction();
       // Car car = (Car) session.load(Car.class, new Long(1));
        Car car=new Car("Grandis","Mitsubishi","BIALA34");
        session.close();

    }
}
