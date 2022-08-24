package personal.website.backend.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Picture {
    @Id
    private Long id;
    private String name;
    private String url;
}
