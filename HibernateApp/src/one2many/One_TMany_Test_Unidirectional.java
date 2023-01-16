package one2many;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class One_TMany_Test_Unidirectional {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		SideDish dish1 = new SideDish();
		dish1.setSideDishId(1114);
		dish1.setSidedishName("chiken65");
		
		SideDish dish2 = new SideDish();
		dish2.setSideDishId(1115);
		dish2.setSidedishName("Omlet");
		
		SideDish dish3 = new SideDish();
		dish3.setSideDishId(1116);
		dish3.setSidedishName("Applo fish");
		
		Set<SideDish> mydishes= new HashSet<SideDish>();
		mydishes.add(dish1);
		mydishes.add(dish2);
		mydishes.add(dish3);
		
		Beer beer= new Beer();
		beer.setBeerId(5);
		beer.setBeerName("xyz");
		beer.setDishes(mydishes);
		
		
		
		session.beginTransaction();
		try{
			
			session.save(beer);
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");
			
			
			List<Beer> blist=session.createQuery("from Beer b ").list();
			for( Beer b: blist) {
				Set<SideDish> sset=b.getDishes();
				System.out.println(b.getBeerId()+"  "+b.getBeerName());
				for( SideDish ss:sset)
				{  System.out.println(ss.getSideDishId()+ "  "+ss.getSidedishName());
					
				}
				
			}
			
			
			
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
			}
		}
		

	}

}
