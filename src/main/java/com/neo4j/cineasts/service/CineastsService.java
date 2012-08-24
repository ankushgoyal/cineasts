package com.neo4j.cineasts.service;

import com.neo4j.cineasts.domain.Actor;
import com.neo4j.cineasts.domain.Movie;

public interface CineastsService {
	
	Actor findActorById(String id);

	Movie findMovieById(String id);
    
	void save(Movie movie);
    
	Iterable<Actor> findAllActors();
	
	Iterable<Movie> findAllMovies();
	
    void save(Actor person);

}
