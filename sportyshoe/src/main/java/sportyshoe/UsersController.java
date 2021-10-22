package sportyshoe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UsersController{
	@Autowired
	UsersService service;
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<users> listUsers =  service.listAll();
		model.addAttribute("listUsers", listUsers);
		
		return "ListUsers";
	}
}
