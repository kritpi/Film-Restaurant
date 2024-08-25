//6510405300 Kritpiruch Chaiwong

package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


import java.util.UUID;

@Data
@Entity
public class Film {
  @Id
  @GeneratedValue
  private UUID id;
  
  private String filmName;
  private String isoValue;
  private Double price;
}
