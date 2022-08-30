package personal.website.backend.config;

import org.springframework.stereotype.Component;
import personal.website.backend.model.Picture;
import personal.website.backend.service.PictureService;

import javax.annotation.PostConstruct;
import java.io.File;

@Component
public class DataInitializer {
    private final PictureService pictureService;

    public DataInitializer(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @PostConstruct
    public void init() {
        File folder = new File("C:\\Users\\Bojan\\Documents\\slikiZaEditiranje\\marjaIVic05.05odbrani");
        System.err.println(folder.getAbsolutePath());
        for (File f : folder.listFiles()) {
            File file = new File(f.getAbsolutePath());
            Picture picture = new Picture(file.getName(), file.getAbsolutePath());
            this.pictureService.save(picture);
        }
    }
}
