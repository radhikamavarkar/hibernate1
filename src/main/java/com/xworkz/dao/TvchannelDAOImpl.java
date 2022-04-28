package com.xworkz.dao;



import com.xworkz.entity.Tvchannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TvchannelDAOImpl implements TvchannelDAO {

	@Override
	public void saveChannel(Tvchannel tvchannel) { 
		EntityManagerFactory factory=null; 
		EntityManager entityManager=null; 
		EntityTransaction tx=null; 
		try { 
			factory=Persistence.createEntityManagerFactory("tv"); 
			entityManager=factory.createEntityManager(); 
			tx=entityManager.getTransaction(); 
			tx.begin();
		} 
		catch(Exception e) {  
			tx.rollback();
			e.printStackTrace();
		} 
		finally { 
			if(factory!=null); 
			factory.close(); 
			
			if(entityManager!=null) 
				entityManager.close();
		}  
	}

	@Override
	public void getchannel() {
		EntityManagerFactory factory=null; 
		EntityManager entityManager=null; 
		EntityTransaction tx=null; 
		try { 
			factory=Persistence.createEntityManagerFactory("tv"); 
			entityManager=factory.createEntityManager(); 
			tx=entityManager.getTransaction(); 
			tx.begin(); 
			Tvchannel channel=entityManager.find(Tvchannel.class, 1); 
			System.out.println("channelId="+channel.getChannelId()); 
			System.out.println("channelId="+channel.getChannelName());  
			System.out.println("channelId="+channel.getLangauge());  
			System.out.println("channelId="+channel.getPrice());  
			System.out.println(channel.toString()); 
			tx.commit();
		} 
		catch(Exception e) { 
			tx.rollback();
			e.printStackTrace();
		} 
		finally { 
			if(factory!=null); 
			factory.close(); 
			
			if(entityManager!=null) 
				entityManager.close();
		}  
	}

		
	}  
	
	
	
	
	

}
