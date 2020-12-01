/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.repositories;

import co.g2m2e1.redflix45.models.Movies;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ESLUNAP Colaborador: Mikheltodd
 */
public interface MoviesRepository extends JpaRepository<Movies, String>{
    List<Movies> findByMovieTitle(String movieTitle);
}
