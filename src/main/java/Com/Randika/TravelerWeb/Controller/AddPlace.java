package Com.Randika.TravelerWeb.Controller;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.Randika.TravelerWeb.Hibernate.PlaceToDB;
import Com.Randika.TravelerWeb.Model.Place;
 
@Controller
public class AddPlace {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
    
    @RequestMapping("/add")
    public String Place(@Valid @ModelAttribute("addPlace") Place thePlace, BindingResult theBindingResult) {
    	
    	if(theBindingResult.hasErrors()) {
    		
    		return "AddPlaces";
    	}
    	
    	else {
    		
    		PlaceToDB theplaceToDB = new PlaceToDB();
    		theplaceToDB.placeToDB(thePlace);
    		return "AddPlaces";
    	}
    }
}
