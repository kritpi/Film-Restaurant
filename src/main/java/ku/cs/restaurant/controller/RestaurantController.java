// 6510405300 Kritpiruch Chaiwong

package ku.cs.restaurant.controller;


import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.UUID;

@RestController
public class RestaurantController {


   @Autowired
   private RestaurantService service;


   @GetMapping("/restaurant")
   public List<Restaurant> getAllRestaurants() {
       return service.getAll();
   }


   @PostMapping("/restaurant")
   public Restaurant create(@RequestBody Restaurant restaurant) {
       return service.create(restaurant);
   }

   @GetMapping("/restaurant/{id}")
   public Restaurant getRestaurantById(@PathVariable UUID id) {
    return service.getRestaurantById(id);
   }

   @PutMapping("/restaurant")
   public Restaurant  update(@RequestBody Restaurant restaurant) {
    return service.update(restaurant);
   }

   @DeleteMapping("/restaurant/{id}") 
   public Restaurant delete(@PathVariable UUID id) {
    return service.delete(id);
   }

   @GetMapping("/restaurant/name/{name}")
   public Restaurant getRestaurantByName(@PathVariable String name) {
    return service.getRestaurantByName(name);
   }

   @GetMapping("/restaurant/location/{location}")
   public List<Restaurant> getRestaurantByLocation(@PathVariable String location) {
    return service.getRestaurantByLocation(location);
   }
}
