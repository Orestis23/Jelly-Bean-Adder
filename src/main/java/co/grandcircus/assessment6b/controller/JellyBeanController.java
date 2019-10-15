package co.grandcircus.assessment6b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.assessment6b.entity.JellyBean;

// @author Orestis Sinis

@Controller
public class JellyBeanController {

	@Autowired
	JellyBeanRepo jbRepo;

	@RequestMapping("/")
	public ModelAndView home() {
		List<JellyBean> jellyBeans = jbRepo.findAll();
		return new ModelAndView("index", "list", jellyBeans);

	}
	
	@RequestMapping("/create-jelly")
	public ModelAndView addJellyBean(JellyBean jbDetails) {
		jbRepo.save(jbDetails);
		return new ModelAndView("redirect:/");
	}
	
//	@RequestMapping("delete-jellybean")
//	public ModelAndView addActivity(@RequestParam("idDelete") int id) {
//		jbRepo.deleteById(id);
//		return new ModelAndView("redirect:/");
//	}

}
