package org.taiji.codehelper.project.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(name = "root_path", nullable = false, columnDefinition = "text")
    private String rootPath;

    @Column(name = "frontend_path", columnDefinition = "text")
    private String frontendPath;

    @Column(name = "server_path", columnDefinition = "text")
    private String serverPath;

    @Column(name = "admin_path", columnDefinition = "text")
    private String adminPath;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "fe_arch", columnDefinition = "text")
    private String feArch;

    @Column(name = "server_arch", columnDefinition = "text")
    private String serverArch;

    @Column(name = "admin_arch", columnDefinition = "text")
    private String adminArch;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "total_files", nullable = false)
    private Integer totalFiles = 0;

    @Column(name = "frontend_files", nullable = false)
    private Integer frontendFiles = 0;

    @Column(name = "server_files", nullable = false)
    private Integer serverFiles = 0;

    @Column(name = "admin_files", nullable = false)
    private Integer adminFiles = 0;

    @Column(name = "modify_count", nullable = false)
    private Integer modifyCount = 0;

    // ===== getters/setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public String getFrontendPath() {
        return frontendPath;
    }

    public void setFrontendPath(String frontendPath) {
        this.frontendPath = frontendPath;
    }

    public String getServerPath() {
        return serverPath;
    }

    public void setServerPath(String serverPath) {
        this.serverPath = serverPath;
    }

    public String getAdminPath() {
        return adminPath;
    }

    public void setAdminPath(String adminPath) {
        this.adminPath = adminPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeArch() {
        return feArch;
    }

    public void setFeArch(String feArch) {
        this.feArch = feArch;
    }

    public String getServerArch() {
        return serverArch;
    }

    public void setServerArch(String serverArch) {
        this.serverArch = serverArch;
    }

    public String getAdminArch() {
        return adminArch;
    }

    public void setAdminArch(String adminArch) {
        this.adminArch = adminArch;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(Integer totalFiles) {
        this.totalFiles = totalFiles;
    }

    public Integer getFrontendFiles() {
        return frontendFiles;
    }

    public void setFrontendFiles(Integer frontendFiles) {
        this.frontendFiles = frontendFiles;
    }

    public Integer getServerFiles() {
        return serverFiles;
    }

    public void setServerFiles(Integer serverFiles) {
        this.serverFiles = serverFiles;
    }

    public Integer getAdminFiles() {
        return adminFiles;
    }

    public void setAdminFiles(Integer adminFiles) {
        this.adminFiles = adminFiles;
    }

    public Integer getModifyCount() {
        return modifyCount;
    }

    public void setModifyCount(Integer modifyCount) {
        this.modifyCount = modifyCount;
    }
}