package com.cap.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;



public class EnhanceConfig {
	
	
	@Autowired
	private DataSource ds;
	
	
	
/*	
	@Bean
	public  LocalSessionFactoryBean getsessionfactory() {
		
		System.out.println("localsession");
		
		 LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		Properties p=new Properties();
		p.put("hibernate.show_sql", true);
		p.put("hibernate.format_sql", true);
		p.put("hibernate.hbm2ddl.auto", "create");
		p.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		
		factory.setDataSource(ds);
		factory.setHibernateProperties(p);
		factory.setAnnotatedClasses(Customer.class,ProductDetails.class);
		return factory;
	}
	
	@Bean(name="sessfactory")
	public SessionFactory getFactory(){
		return getsessionfactory().getObject();
	}
	
	@Bean
	public HibernateTemplate getTemplate(){
		return new HibernateTemplate(getFactory());
		
	}*/
	
	

}
