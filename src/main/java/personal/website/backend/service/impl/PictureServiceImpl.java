package personal.website.backend.service.impl;

import personal.website.backend.model.Picture;
import personal.website.backend.repository.PictureRepository;
import personal.website.backend.service.PictureService;

import java.util.List;

public class PictureServiceImpl  implements PictureService {

    private final PictureRepository pictureRepository;

    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Override
    public List<Picture> findAll() {
        return this.pictureRepository.findAll();
    }
}
