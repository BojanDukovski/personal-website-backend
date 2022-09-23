package personal.website.backend.service.impl;

import org.springframework.stereotype.Service;
import personal.website.backend.model.Project;
import personal.website.backend.repository.ProjectRepository;
import personal.website.backend.service.ProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        return this.projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return this.projectRepository.findAll();
    }
}
