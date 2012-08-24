package com.neo4j.cineasts.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Actor {
	
	@GraphId Long nodeId;
	String id;
	String name;
	Set<Movie> filmography;
	
	public Actor() {
		
	}
	
	Role playedIn(Movie movie, String role) {
		return null;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getFilmography() {
		return filmography;
	}

	public void setFilmography(Set<Movie> filmography) {
		this.filmography = filmography;
	}

}
