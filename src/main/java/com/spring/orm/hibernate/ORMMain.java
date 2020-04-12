package com.spring.orm.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Vehicle;

public class ORMMain {

	public final static String db_query_sql_vehicle = "SELECT * from Vehicle where vehicleId = 1";
	public final static String db_query_hql = "from Vehicle where vehicleId = 1";
	public final static String db_query_sql_employee = "SELECT count(*) from Employee_Details2";


	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery(db_query_hql);
		query.setCacheable(true); // Enable caching of this query result set.
		List<Vehicle> vehicleOut2 = query.list();
		session.getTransaction().commit();

		Vehicle vehicle1 = (Vehicle) session.get(Vehicle.class, 1);
		System.out.println("Way 1 :: Results got from database :: Hibernate Object Way - " + vehicle1.getName());

		System.out.println("Way 2 :: Results got from database :: HQL way- ");
		vehicleOut2.forEach(p -> System.err.println(p.getName()));

		System.out.println("Way 3 :: Results got from database :: SQL way- ");
		Query query2 = session.createSQLQuery(db_query_sql_vehicle);
		Object[] object = (Object[]) query2.list().get(0);
		System.err.println(object[1]);

	}
}
