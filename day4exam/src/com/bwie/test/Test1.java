package com.bwie.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.bwie.model.Country;
import com.bwie.model.Person;
import com.bwie.util.HibernateUtil;

public class Test1 {
	private Session session=null;
	@Test
	public void listPersons(){
		session=HibernateUtil.getSession();
		String hql="from Person";
		Query q = session.createQuery(hql);
		List<Person> list = q.list();
		for(Person p :list){
			System.out.println(p);
		}
		
	}
	
	@Test
	public void addCountry(){
		session=HibernateUtil.getSession();
		Transaction t = session.beginTransaction();
		Country c = new Country();
		c.setCname("俄罗斯");
		session.save(c);
		t.commit();
		HibernateUtil.closeSession();
	}
	
	
	@Test
	public void addPerson(){
		session=HibernateUtil.getSession();
		Transaction t = session.beginTransaction();
		String hql1="from Country where cname=?";
		Query qq = session.createQuery(hql1);
		qq.setString(0,"美国");
		List<Country> l = qq.list();
		Country c= l.get(0);
		System.out.println(c);
		
		
		Person p = new Person();
		
		p.setName("李琦");
		p.setSex("女");
		p.setAddr("巴丹");
		p.setAge(23);
		p.setCid(c);
		
		
		session.save(p);
		
		t.commit();
		HibernateUtil.closeSession();
	}
	
	@Test
	public void update(){
		session=HibernateUtil.getSession();
		Transaction t = session.beginTransaction();
		String hql="from Person where name=?";
		Query q = session.createQuery(hql);
		q.setString(0,"张三");
		List<Person> list = q.list();
		Person p = list.get(0);
		
		
		String hql1="from Country where cname=?";
		Query qq = session.createQuery(hql1);
		qq.setString(0,"美国");
		List<Country> l = qq.list();
		Country c= l.get(0);
		
		p.setCid(c);
		session.update(p);
		t.commit();
		HibernateUtil.closeSession();
	}
	
}
