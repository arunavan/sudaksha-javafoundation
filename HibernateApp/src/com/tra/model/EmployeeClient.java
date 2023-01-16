package com.tra.model;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmployeeClient {
		public static void main(String[] args) {
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			//insert
			
			Transaction tx=session.getTransaction();
			tx.begin();//transaction insert,delete,update
			Employee employee1 = new Employee();//
			employee1.setName("bahati123");
	        employee1.setSalary(999999.99);
			session.save(employee1);// insert into table....
			tx.commit();
			System.out.println("Data inserted successfully");
			
			
			//update
			System.out.println("enter employee id,name to be updated");
			Scanner sc=new Scanner(System.in);
			int eid=sc.nextInt();sc.nextLine();
			String nname=sc.nextLine();
			Double nsalary=sc.nextDouble();
			Employee e=(Employee)session.load(Employee.class,eid);
				System.out.println("BEfore update:"+e);
			Transaction tx1=session.getTransaction();
			tx1.begin();
				e.setName(nname);
				e.setSalary(nsalary);
			tx1.commit();
			Employee e1=(Employee)session.load(Employee.class,eid);
			System.out.println("After update:"+e1);
			
			//delete
			System.out.println("enter employee id to be deleted");
			int eid1=sc.nextInt();
			Employee ee1=(Employee)session.load(Employee.class,eid1);
			Transaction tx2=session.getTransaction();
			tx2.begin();
			session.delete(ee1);
			tx2.commit();
			System.out.println("employee deleted..");
			//list
			
			Query query=session.createQuery("from Employee e"); //HQL  select * from employee
			
			List<Employee> elist=query.list();
			System.out.println(" Employe elist ======");
			for(Employee emp:elist) {
				System.out.println(emp);
			}
			
			
			
				
				
		}

	}
