package personal.website.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import personal.website.backend.model.Picture;
import personal.website.backend.service.PictureService;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class PictureController {

    private final PictureService pictureService;
    private final String rootPath = "src/main/resources/static/pictures/";

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }
    @GetMapping(value = "/picture", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getPicture (@RequestParam String path) throws IOException {
        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);
        return inputStream.readAllBytes();
    }

    @GetMapping("/pictures")
    public List<Picture> findAllPictures () {
        return this.pictureService.findAll();
    }

    @PostMapping("/addPictures")
    public List<Picture> addPicturesForm (@RequestParam("pictures") @Nullable MultipartFile[] pictures) throws IOException {
        List<Picture> listOfUploadedPictures = new ArrayList<>();
        for (MultipartFile file : pictures) {
            String path = this.rootPath + file.getOriginalFilename();
            byte[] bytes = new byte[0];
            bytes = file.getBytes();
            Path p = Paths.get(path);
            Files.write(p, bytes);
            Picture picture = new Picture(file.getOriginalFilename(), path);
            this.pictureService.save(picture);
            listOfUploadedPictures.add(picture);
        }
        return listOfUploadedPictures;
    }
}
