package com.todolist.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="to_do_list")
public class Entities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long itemId;
	
	@Column(name="TITLE")
	private String itemTitle;
	
	@Column(name="DESCRIPTION")
	private String itemDescription;
	
	public Entities(Long itemId, String itemTitle, String itemDescription) {
		super();
		this.itemId = itemId;
		this.itemTitle = itemTitle;
		this.itemDescription = itemDescription;
	}

	public Entities() {
		
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	
	
	

	
}
