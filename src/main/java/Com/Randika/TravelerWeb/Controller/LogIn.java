package Com.Randika.TravelerWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import Com.Randika.TravelerWeb.Model.Log;
import Com.Randika.TravelerWeb.Model.Search;
 
@Controller
public class LogIn {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
 
    @RequestMapping("/Logging")
    public String Logging(@Valid @ModelAttribute("log") Log theLog, BindingResult theBindingResult, Model model) {
    	
    	Search theSearch = new Search();
		model.addAttribute("searchPlace",theSearch);
		
    	if(theBindingResult.hasErrors()) {
    		return "Home";
    	}
    	
    	else {
    		return "Home";
    	}
    }
}

