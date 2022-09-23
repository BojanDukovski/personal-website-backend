package personal.website.backend.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@Entity
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 100000)
    private String description;
    @Nullable
    private String optionalDescription;
    @Nullable
    private String link;

    //private Picture picture;

    public Project() {}

    public Project (Long id, String name, String description, String optionalDescription, String link) {
        this.name = name;
        this.description = description;
        this.optionalDescription = optionalDescription;
        this.link = link;
    }
    public Project(String name, String description, String optionalDescription, String link) {
        this.name = name;
        this.description = description;
        this.optionalDescription = optionalDescription;
        this.link = link;
    }
}
