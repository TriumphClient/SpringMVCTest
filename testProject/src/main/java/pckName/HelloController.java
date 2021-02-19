package pckName;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	 @GetMapping({"/", "/hello"})
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView MandV = new ModelAndView("home").addObject("name","(This is a test name)");
		return MandV;
	}

}