//6510405300 Kritpiruch Chaiwong

package ku.cs.restaurant.service;

import ku.cs.restaurant.entity.Film;
import ku.cs.restaurant.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FilmService {
  @Autowired
  public FilmRepository repository;

  public List<Film> getAll() {
    return repository.findAll();
  }

  public Film create(Film film) {
    Film record = repository.save(film);
    return record;
  }

  public Film getFilmById(UUID id) {
    return repository.findById(id).get();
  }

  public Film update(Film requestBody) {
    UUID id = requestBody.getId();
    Film record = repository.findById(id).get();
    record.setFilmName(requestBody.getFilmName());
    record.setIsoValue(requestBody.getIsoValue());
    record.setPrice(requestBody.getPrice());
    
    record = repository.save(record);
    return record;
   }

   public Film delete(UUID id) {
    Film record = repository.findById(id).get();
    repository.deleteById(id);
    return record;
   }

  public Film getFilmByName(String name) {
      return repository.findFilmByFilmName(name);
  }

  public List<Film> getFilmByIso(String isoValue) {
      List<Film> records = repository.findFilmByIsoValue(isoValue);
      return records;
  }
  
}
