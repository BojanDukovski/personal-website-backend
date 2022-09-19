package personal.website.backend.service.impl;

import org.springframework.stereotype.Service;
import personal.website.backend.model.Picture;
import personal.website.backend.repository.PictureRepository;
import personal.website.backend.service.PictureService;

import java.io.File;
import java.util.List;

@Service
public class PictureServiceImpl  implements PictureService {

    private final PictureRepository pictureRepository;
    private final String rootPath = "/resources/static/pictures";
    private final File root = new File (rootPath);

    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }
    @Override
    public List<Picture> findAll() {
        return this.pictureRepository.findAll();
    }

    @Override
    public Picture save(Picture picture) {
        return this.pictureRepository.save(picture);
    }
    @Override
    public Picture findById(Long id) {
        return this.pictureRepository.findById(id).orElse(null);
    }

    @Override
    public Picture findByName(String name) {
        return this.pictureRepository.findByName(name);
    }

    @Override
    public List<Picture> saveAll(List<Picture> pictures) {
        return this.pictureRepository.saveAll(pictures);
    }


}
