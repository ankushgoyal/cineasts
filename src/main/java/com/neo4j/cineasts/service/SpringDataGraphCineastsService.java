package com.neo4j.cineasts.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.neo4j.cineasts.controller.HomeController;
import com.neo4j.cineasts.domain.Actor;
import com.neo4j.cineasts.domain.Movie;

@Component
public class SpringDataGraphCineastsService implements CineastsService {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringDataGraphCineastsService.class);

	
	@Autowired
	Neo4jTemplate template;

	@Override
	public Actor findActorById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Movie findMovieById(String id) {
		try {
			Movie movie = template.save(new Movie("Forrest Gump", 1994));
			return template.findOne(movie.getNodeId(), Movie.class);
		}catch(Exception e) {
			logger.info("error recieved!");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save(Movie movie) {
		template.save(movie);
	}

	@Override
	public Iterable<Actor> findAllActors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Movie> findAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Actor person) {
		// TODO Auto-generated method stub

	}

}
