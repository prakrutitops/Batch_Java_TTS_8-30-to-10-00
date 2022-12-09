package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Tops;

public class Dao 
{
	public void Insert(Tops t)
	{
		
		Session sess = Util.getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(t);
		tr.commit();
		sess.close();
		
	}
	
	public void Update(Tops t)
	{
		
		Session sess = Util.getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(t);
		tr.commit();
		sess.close();
		
	}
	
	
	public void Delete(Tops t)
	{
		
		Session sess = Util.getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(t);
		tr.commit();
		sess.close();
		
	}
	
	public List<Tops> viewRecords()
	{
		Session sess = new Util().getconnect();
		List<Tops> getall = sess.createQuery("from Tops").list();
		
		sess.close();
		return getall;
	}
	
	public Tops getSingle(Tops p)
	{
		Session sess = new Util().getconnect();
		Tops person = (Tops) sess.get(Tops.class, p.getId());
		
		sess.close();
		return person;
	}
	
}
