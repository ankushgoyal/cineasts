package com.neo4j.cineasts.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Movie {
	
	@GraphId Long nodeId;
	String id;
	String title;
	int year;
	Set<Role> cast;
	
	public Movie() {
		
	}
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<Role> getCast() {
		return cast;
	}

	public void setCast(Set<Role> cast) {
		this.cast = cast;
	}

}
