package personal.website.backend.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Picture {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

    public Picture (){}
    public Picture (String name, String url) {
        this.name = name;
        this.url = url;
    }
}

