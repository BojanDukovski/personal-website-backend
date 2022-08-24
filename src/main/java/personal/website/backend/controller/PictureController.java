package personal.website.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.website.backend.model.Picture;
import personal.website.backend.service.PictureService;

import java.util.List;

@RestController("/api/pictures")
@CrossOrigin(origins = "https://library-lab2-emt-front.herokuapp.com")
public class PictureController {

    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping
    public List<Picture> getAll () {
        return this.pictureService.findAll();
    }
}
