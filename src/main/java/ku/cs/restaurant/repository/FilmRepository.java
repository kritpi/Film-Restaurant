//6510405300 Kritpiruch Chaiwong

package ku.cs.restaurant.repository;

import ku.cs.restaurant.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film,UUID> {
  Film findFilmByFilmName(String filmName);
  List<Film> findFilmByIsoValue(String isoValue);

} 