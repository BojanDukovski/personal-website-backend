package personal.website.backend.service;

import org.springframework.stereotype.Service;
import personal.website.backend.model.Picture;

import java.util.List;

public interface PictureService {
    List<Picture> findAll();
    Picture save (Picture picture);
}
