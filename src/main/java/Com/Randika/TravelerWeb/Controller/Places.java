package Com.Randika.TravelerWeb.Controller;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Com.Randika.TravelerWeb.Hibernate.SearchDoa;
import Com.Randika.TravelerWeb.Model.Log;
import Com.Randika.TravelerWeb.Model.Search;
 
@Controller
public class Places {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	SearchDoa theSearchDoa = new SearchDoa();
	Header theHeader = new Header();
    
    @RequestMapping("/Search")
    public String Place(@Valid @ModelAttribute("searchPlace") Search theSearch, BindingResult theBindingResult, Model model) {
    	
    	if(theBindingResult.hasErrors()) {
    		Log theLog = new Log();
    		model.addAttribute("log",theLog);
    		return "Home";
    	}
    	
    	else {
    		
    		theHeader.header(model);
    		
    		if(!(theSearchDoa.searchPlace(theSearch).isEmpty())) {
    			model.addAttribute("searchPlace",theSearchDoa.searchPlace(theSearch));
    			return "Places";
    		}
    		
    		else {
    			model.addAttribute("notFound","Not Found !");
    			Log theLog = new Log();
        		model.addAttribute("log",theLog);
    			return "Home";
    		}
    	}
    }
    
    @RequestMapping(value="/Search", method=RequestMethod.GET)
    public String suggestions(@RequestParam("Name") @ModelAttribute("searchPlace") String suggestion, Model model) {
    	
    	model.addAttribute("searchPlace",theSearchDoa.searchPlace(suggestion));
    	theHeader.header(model);
    	return "Places";
    }
}
