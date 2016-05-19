package com.blackbriar.demo;


public class HibernateDemo {
/*	@Ignore
	@Test
	public void CreateTableTest() {
		Configuration cfg = new Configuration().configure();
		cfg.addClass(People.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

	@Test
	public void InsertTest() {
		Configuration cfg = new Configuration().configure();
		cfg.addClass(People.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		SessionFactory sessionFactory = cfg.buildSessionFactory(registry);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		People people = new People();
		people.setName("李四");
		people.setAge(18);
		session.save(people);
		transaction.commit();
	}*/
}
