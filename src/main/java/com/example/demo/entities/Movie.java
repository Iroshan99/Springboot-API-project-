
package com.example.demo.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieid;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie title")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie director name")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie studio name")
    private String studio;

    @ElementCollection
    @CollectionTable(name= "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie realise year")
    private Integer realiseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie poster")
    private String poster;

}
