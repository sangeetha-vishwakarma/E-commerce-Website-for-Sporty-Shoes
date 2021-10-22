package sportyshoe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoeController {
	@Autowired
	private ShoeService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Shoes> listShoes = service.listAll();
		model.addAttribute("listShoes", listShoes);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewShoesPage(Model model) {
		Shoes shoe = new Shoes();
		model.addAttribute("shoes", shoe);
		
		return "new-shoe";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveShoe(@ModelAttribute("shoes") Shoes shoe) {
		service.save(shoe);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditShoesPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit-shoe");
		Shoes shoe = service.get(id);
		mav.addObject("shoes", shoe);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteShoe(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
