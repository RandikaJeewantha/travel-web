package Com.Randika.TravelerWeb.Model;

import org.springframework.web.multipart.MultipartFile;

public class Image {

    private MultipartFile[] files;

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

}

