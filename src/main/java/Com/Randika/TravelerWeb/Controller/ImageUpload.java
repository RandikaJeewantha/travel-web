package Com.Randika.TravelerWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Com.Randika.TravelerWeb.Model.Image;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;

@Controller
public class ImageUpload {

    private static String UPLOADED_FOLDER = "C://Users//Randika Jeewantha//Documents//workspace-sts-3.9.9.RELEASE//TravelerWeb//uploads//";
    
    @RequestMapping("/upload")
    public String multiFileUpload(@ModelAttribute("uploadForm") Image theImage, RedirectAttributes redirectAttributes) {
    	
    	System.out.println("start");
        StringJoiner sj = new StringJoiner(" , ");
        System.out.println("sj");
        System.out.println("get f: "+theImage.getFiles());
        for (MultipartFile file : theImage.getFiles()) {
        	System.out.println("start for");
            if (file.isEmpty()) {
            	System.out.println("emt");
                continue;
            }

            try {

                byte[] bytes = file.getBytes();
                Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
                Files.write(path, bytes);

                sj.add(file.getOriginalFilename());
                System.out.println("add");
            } 
            
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("err");
            }

        }
        System.out.println("end for");
        String uploadedFileName = sj.toString();
        System.out.println("sj"+uploadedFileName);
        
        if (StringUtils.isEmpty(uploadedFileName)) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
        } 
        
        else {
            redirectAttributes.addFlashAttribute("message", "You successfully uploaded '" + uploadedFileName + "'");
        }

        return "redirect:/AddPlaces";

    }
}
