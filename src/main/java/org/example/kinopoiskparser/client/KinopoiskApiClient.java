package org.example.kinopoiskparser.client;


import org.example.kinopoiskparser.entity.Movie;
import org.example.kinopoiskparser.entity.MovieApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(name = "KinopoiskApiClient", url = "https://api.kinopoisk.dev", configuration = FeignConfig.class)
public interface KinopoiskApiClient {
    @GetMapping("/v1.4/movie/{id}")
    Optional<Movie> findById(@PathVariable("id") Long id);

    @GetMapping("/v1.4/movie/search")
    MovieApi findByPageByName(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "query") String name
    );

    @GetMapping("/v1.4/movie")
    MovieApi findByPageByRatingKp(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "rating.kp") String rating
    );

    @GetMapping("/v1.4/movie")
    MovieApi findByPageByRGenres(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "genres.name") String genre
    );

}
