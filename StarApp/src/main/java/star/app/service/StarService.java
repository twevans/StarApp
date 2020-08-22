package star.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import star.app.dao.StarDao;
import star.app.entities.Star;

@Service
public class StarService {

	@Autowired
	private StarDao starDao;
	
	public Star createStar(Star star) {
		
		return starDao.save(star);
	}

	public Star getStarById(Integer id) {
		return starDao.findById(id).orElse(null);
	}

	public Iterable<Star> getAllStars() {
		return starDao.findAll();
	}

	

}
