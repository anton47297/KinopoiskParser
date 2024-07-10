package org.example.kinopoiskparser.repositiries;

import org.example.kinopoiskparser.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByIdIn(List<Long> movieIds);
}
