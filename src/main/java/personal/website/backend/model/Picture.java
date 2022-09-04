package personal.website.backend.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

    public Picture (){}
    public Picture (String name, String url) {
        this.name = name;
        this.url = url;
    }
    public Picture (Long id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }
}

