package com.xworkz.runner;


import com.xworkz.dao.TvchannelDAO;
import com.xworkz.dao.TvchannelDAOImpl;
import com.xworkz.entity.Tvchannel;

public class Mainclass { 
	public static void main(String[] args) {
		Tvchannel channelEntity=new Tvchannel(); 
		channelEntity.setChannelId(1); 
		channelEntity.setChannelName("caa");  
		channelEntity.setLangauge("kannada"); 
		channelEntity.setFree(false); 
		channelEntity.setPrice(125.45); 
		
		TvchannelDAO tv=new TvchannelDAOImpl();  
		tv.saveChannel(channelEntity);	 
	System.out.println("saved successfully"); 
	
	tv.getchannel(); 
	System.out.println("successfully fetched data");												.o
	}
}
