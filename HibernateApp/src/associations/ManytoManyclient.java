package associations;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



public class ManytoManyclient {
	
		public static void main(String[] args) {

			
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			
			session.getTransaction().begin();

			// first define few products before we place order

			Product elecProduct = new Product();
			elecProduct.setId(1);
			elecProduct.setName("LED TV");
			elecProduct.setPrice(45000);

			Product beautyProduct = new Product();
			beautyProduct.setId(2);
			beautyProduct.setName("Face Wash");
			beautyProduct.setPrice(80);

			Product babyProduct = new Product();
			babyProduct.setId(3);
			babyProduct.setName("Pampers");
			babyProduct.setPrice(15);

			Product eleProduct = new Product();
			eleProduct.setId(4);
			eleProduct.setName("CFL Bulb");
			eleProduct.setPrice(250);

			// now define first order and add few products in it
			Order firstOrder = new Order();
			firstOrder.setId(1000);
			firstOrder.setPurchaseDate(new Date());

			firstOrder.addProduct(babyProduct);
			firstOrder.addProduct(elecProduct);
			firstOrder.addProduct(beautyProduct);

			// now define second order and add few products in it
			Order secondOrder = new Order();
			secondOrder.setId(1001);
			secondOrder.setPurchaseDate(new Date());

			secondOrder.addProduct(babyProduct);		
			secondOrder.addProduct(elecProduct);
			secondOrder.addProduct(eleProduct);

			// save orders using entity manager

			session.save(firstOrder);
			session.save(secondOrder);
			
			System.out.println("Added orders along with order details to database.");

			session.getTransaction().commit();
			
		}
	}
