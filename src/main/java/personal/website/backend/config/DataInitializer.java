package personal.website.backend.config;

import org.springframework.stereotype.Component;
import personal.website.backend.model.Picture;
import personal.website.backend.repository.PictureRepository;
import personal.website.backend.service.PictureService;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.io.File;

@Component
public class DataInitializer {
    private final PictureRepository pictureRepository;

    public DataInitializer(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @PostConstruct
    @Transactional
    public void initData() {
        File folder = new File("C:\\Users\\Bojan\\Documents\\slikiZaEditiranje\\marjaIVic05.05odbrani");
        System.err.println(folder.getAbsolutePath());
        for (File f : folder.listFiles()) {
            File file = new File(f.getAbsolutePath());
            Picture picture = new Picture(file.getName(), file.getAbsolutePath());
            this.pictureRepository.save(picture);
        }
    }
}
