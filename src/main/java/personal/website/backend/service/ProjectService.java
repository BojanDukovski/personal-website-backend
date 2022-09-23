package personal.website.backend.service;

import personal.website.backend.model.Project;

import java.util.List;

public interface ProjectService {
    Project save (Project project);
    List<Project> findAll();
}
