package personal.website.backend.controller;

import org.springframework.web.bind.annotation.*;
import personal.website.backend.model.Picture;
import personal.website.backend.service.PictureService;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/pictures")
@CrossOrigin(origins = "https://bojandukovski.herokuapp.com")
public class PictureController {

    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping
    public List<Picture> findAllPictures () {
        return this.pictureService.findAll();
    }
}
