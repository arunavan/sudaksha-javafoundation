package one2one;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class One_TOne_Test_Unidirectional {
	public static void main(String[] args) {
		Session session= new Configuration().configure().
				buildSessionFactory().openSession();
		LaptopBag bag1 = new LaptopBag();  //part
		bag1.setBagId(105);
		bag1.setColor("YELLOW123");
		Scholar scholar = new Scholar();  //main
		scholar.setScholarId(2);
		scholar.setScholarName("Janquelin123");
		scholar.setBag(bag1);
		session.beginTransaction();
		Scholar s=(Scholar)session.load(Scholar.class, 41);
		session.delete(s);
	//	session.save(scholar);
		session.getTransaction().commit();
		System.out.println("saved  deleted successfully");
	    session.close();
	}
}
