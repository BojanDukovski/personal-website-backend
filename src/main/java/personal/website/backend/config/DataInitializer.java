package personal.website.backend.config;

import org.springframework.stereotype.Component;
import personal.website.backend.model.Picture;
import personal.website.backend.service.PictureService;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.io.*;
import java.util.List;

@Component
public class DataInitializer {
    private final PictureService pictureService;

    public DataInitializer(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @PostConstruct
    @Transactional
    public void initData() throws IOException {
        File rootFolder = new File("C:\\Users\\Bojan\\Documents\\Github\\personal-website\\public\\images\\feed");
        for (File f : rootFolder.listFiles()) {
            File file = new File(f.getAbsolutePath());
            String path = file.getAbsolutePath().split("public")[1];
            Picture picture = new Picture(file.getName(), path);
            if (this.pictureService.findByName(picture.getName()) == null) {
                this.pictureService.save(picture);
            }
        }
    }
}
