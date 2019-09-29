package Com.Randika.TravelerWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.Randika.TravelerWeb.Hibernate.AncientDoa;
import Com.Randika.TravelerWeb.Hibernate.NatureDoa;
import Com.Randika.TravelerWeb.Hibernate.NewlyBuildDoa;
import Com.Randika.TravelerWeb.Model.Message;

@Controller
@RequestMapping()
public class Header {
	public void header(Model theModel){
		NatureDoa theNatureDoa = new NatureDoa();
		theModel.addAttribute("theNature", theNatureDoa.natureDoa());
		
		AncientDoa theAncientDoa = new AncientDoa();
		theModel.addAttribute("theAncient", theAncientDoa.ancientDoa());
		
		NewlyBuildDoa theNewlyBuildDoa = new NewlyBuildDoa();
		theModel.addAttribute("theNewlyBuild", theNewlyBuildDoa.newlyBuildDoe());
	}
	
	@RequestMapping("/ContactPage")
    public String Contact(Model theModel) {
    	
    	Message theMessage = new Message();
		theModel.addAttribute("message", theMessage);
		
		header(theModel);
		
        return "Contact";
    }
}
