package personal.website.backend.service;

import org.springframework.web.multipart.MultipartFile;
import personal.website.backend.model.Picture;

import java.io.IOException;
import java.util.List;

public interface PictureService {
    List<Picture> findAll();
    Picture save (Picture picture);
    Picture findById(Long id);
    Picture findByName (String name);
    List<Picture> saveAll(List<Picture> pictures);
}
