package personal.website.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personal.website.backend.model.Picture;

import java.util.List;
import java.util.Optional;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
    List<Picture> findAll();
    Picture save (Picture picture);
    Optional<Picture> findById (Long id);
    Picture findByName (String name);
}
