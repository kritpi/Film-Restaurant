// 6510405300 Kritpiruch Chaiwong

package ku.cs.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ku.cs.restaurant.entity.Film;
import ku.cs.restaurant.service.FilmService;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@RestController
public class FilmController {
  @Autowired
  private FilmService service;

  @GetMapping("/film")
  public List<Film> getAllFilms() {
    return service.getAll();
  }

  @PostMapping("/film")
   public Film create(@RequestBody Film film) {
       return service.create(film);
   }

   @GetMapping("/film/{id}")
   public Film getFilmById(@PathVariable UUID id) {
    return service.getFilmById(id);
   }

   @PutMapping("/film")
   public Film  update(@RequestBody Film film) {
    return service.update(film);
   }

   @DeleteMapping("/film/{id}") 
   public Film delete(@PathVariable UUID id) {
    return service.delete(id);
   }

   @GetMapping("/film/name/{name}")
   public Film getRestaurantByName(@PathVariable String name) {
    return service.getFilmByName(name);
   }

   @GetMapping("/film/iso/{iso}")
   public List<Film> getFilmByIso(@PathVariable String iso) {
    return service.getFilmByIso(iso);
   }
}
