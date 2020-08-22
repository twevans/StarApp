package star.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import star.app.entities.Star;

public interface StarDao extends CrudRepository<Star, Integer>{

}
