 package Com.Randika.TravelerWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.Randika.TravelerWeb.Model.Image;
import Com.Randika.TravelerWeb.Model.Log;
import Com.Randika.TravelerWeb.Model.Place;
import Com.Randika.TravelerWeb.Model.Search;
 
@Controller
@RequestMapping("/")
public class Home {
 
	Search theSearch = new Search();
	Log theLog = new Log();
	Header theHeader = new Header();
	
    @RequestMapping()
    public String StartPage(Model theModel) {
    	
    	theModel.addAttribute("searchPlace", theSearch);
    	theModel.addAttribute("log", theLog);
    	theHeader.header(theModel);
    	return "Home";
    }
    
    @RequestMapping("/HomePage")
    public String HomePage(Model theModel) {
    	
    	return StartPage(theModel);
    }
    
    @RequestMapping("/AddPlaces")
    public String AddPlaces(Model theModel) {
    	
    	Place thePlace = new Place();
    	theModel.addAttribute("addPlace", thePlace);
    	
    	Image theImage = new Image();
    	theModel.addAttribute("uploadForm", theImage);
    	
    	theHeader.header(theModel);
    	
        return "AddPlaces";
    }
    
}
