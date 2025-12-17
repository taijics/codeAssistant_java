package org.taiji.codehelper.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.taiji.codehelper.project.dto.ProjectCreateRequest;
import org.taiji.codehelper.project.dto.ProjectDto;
import org.taiji.codehelper.project.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")  // 开发期方便前端调用，生产环境可收紧
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    /** 列表：GET /api/projects */
    @GetMapping
    public List<ProjectDto> listProjects() {
        return projectService.listAll();
    }

    /** 详情：GET /api/projects/{id} */
    @GetMapping("/{id}")
    public ProjectDto getProject(@PathVariable Long id) {
        return projectService.getById(id);
    }

    /** 新增：POST /api/projects */
    @PostMapping
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectCreateRequest request) {
        ProjectDto created = projectService.create(request);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    /** 修改：PUT /api/projects/{id} */
    @PutMapping("/{id}")
    public ProjectDto updateProject(@PathVariable Long id, @RequestBody ProjectCreateRequest request) {
        return projectService.update(id, request);
    }

    /** 删除：DELETE /api/projects/{id} */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProject(@PathVariable Long id) {
        projectService.delete(id);
    }
}