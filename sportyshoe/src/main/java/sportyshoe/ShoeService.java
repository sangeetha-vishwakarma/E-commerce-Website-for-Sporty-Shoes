package sportyshoe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ShoeService {

	@Autowired
	private ShoeRepository repo;
	
	public List<Shoes> listAll() {
		return repo.findAll();
	}
	
	public void save(Shoes shoe) {
		repo.save(shoe);
	}
	
	public Shoes get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
