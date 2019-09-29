package Com.Randika.TravelerWeb.Controller;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.Randika.TravelerWeb.Hibernate.MessageToDB;
import Com.Randika.TravelerWeb.Model.Message;
 
@Controller
public class Messages {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
    
    @RequestMapping("/msg")
    public String messages(@Valid @ModelAttribute("message") Message theMessages, BindingResult theBindingResult) {
    	
    	if(theBindingResult.hasErrors()) {
    		System.out.println("err");
    		System.out.println(theBindingResult);
    		return "Contact";
    	}
    	
    	else {
    		
    		MessageToDB theMessageToDB = new MessageToDB();
    		theMessageToDB.messageToDB(theMessages);
    		System.out.println("done");
    		return "Contact";
    	}
    }
}
