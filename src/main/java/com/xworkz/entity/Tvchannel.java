package com.xworkz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data 
@Entity 
@Table	(name="tv_Channel")
public class Tvchannel { 
	
	@Id
	@Column(name="channel_Id")
	private int channelId; 
	
	@Column(name="channel_name")
	private String channelName; 
	
	@Column(name="cost")
	private String langauge; 
	private double price; 
	@Column(name="is_free")
	 
	private boolean isFree;
	
}
