package org.taiji.codehelper.project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.taiji.codehelper.project.domain.ProjectEntity;
import org.taiji.codehelper.project.dto.ProjectCreateRequest;
import org.taiji.codehelper.project.dto.ProjectDto;
import org.taiji.codehelper.project.repository.ProjectRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectDto> listAll() {
        return projectRepository.findAll()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public ProjectDto getById(Long id) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found: " + id));
        return toDto(entity);
    }

    @Transactional
    public ProjectDto create(ProjectCreateRequest request) {
        ProjectEntity entity = new ProjectEntity();
        entity.setName(request.getName());
        entity.setRootPath(request.getRootPath());
        entity.setFrontendPath(request.getFrontendPath());
        entity.setServerPath(request.getServerPath());
        entity.setAdminPath(request.getAdminPath());
        entity.setDescription(request.getDescription());
        entity.setFeArch(request.getFeArch());
        entity.setServerArch(request.getServerArch());
        entity.setAdminArch(request.getAdminArch());

        entity.setCreatedAt(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());

        ProjectEntity saved = projectRepository.save(entity);
        return toDto(saved);
    }

    @Transactional
    public ProjectDto update(Long id, ProjectCreateRequest request) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found: " + id));

        entity.setName(request.getName());
        entity.setRootPath(request.getRootPath());
        entity.setFrontendPath(request.getFrontendPath());
        entity.setServerPath(request.getServerPath());
        entity.setAdminPath(request.getAdminPath());
        entity.setDescription(request.getDescription());
        entity.setFeArch(request.getFeArch());
        entity.setServerArch(request.getServerArch());
        entity.setAdminArch(request.getAdminArch());
        entity.setUpdatedAt(LocalDateTime.now());

        ProjectEntity saved = projectRepository.save(entity);
        return toDto(saved);
    }

    @Transactional
    public void delete(Long id) {
        if (!projectRepository.existsById(id)) {
            return;
        }
        projectRepository.deleteById(id);
    }

    private ProjectDto toDto(ProjectEntity entity) {
        ProjectDto dto = new ProjectDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setRootPath(entity.getRootPath());
        dto.setFrontendPath(entity.getFrontendPath());
        dto.setServerPath(entity.getServerPath());
        dto.setAdminPath(entity.getAdminPath());
        dto.setDescription(entity.getDescription());
        dto.setFeArch(entity.getFeArch());
        dto.setServerArch(entity.getServerArch());
        dto.setAdminArch(entity.getAdminArch());
        dto.setTotalFiles(entity.getTotalFiles());
        dto.setFrontendFiles(entity.getFrontendFiles());
        dto.setServerFiles(entity.getServerFiles());
        dto.setAdminFiles(entity.getAdminFiles());
        dto.setModifyCount(entity.getModifyCount());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        return dto;
    }
}