package com.example.demo.repository;

import com.example.demo.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepostory  extends JpaRepository<Movie, Integer> {
}
