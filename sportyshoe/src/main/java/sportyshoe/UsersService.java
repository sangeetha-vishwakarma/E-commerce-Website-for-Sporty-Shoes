package sportyshoe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersService {
	@Autowired
	private UsersRepository repo;
	
	public List<users> listAll() {
		return repo.findAll();
	}
	
}
