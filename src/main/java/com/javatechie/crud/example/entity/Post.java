package com.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "POEMS_TABLE")
public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String poem;
   
    
    public Post() {}
	public Post(int id, String name, String poem) {
		super();
		this.id = id;
		this.name = name;
		this.poem = poem;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoem() {
		return poem;
	}
	public void setPoem(String poem) {
		this.poem = poem;
	}
	
    
}
