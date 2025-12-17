package org.taiji.codehelper.project.dto;

import java.time.LocalDateTime;

public class ProjectDto {

    private Long id;
    private String name;
    private String rootPath;
    private String frontendPath;
    private String serverPath;
    private String adminPath;

    private String description;
    private String feArch;
    private String serverArch;
    private String adminArch;

    private Integer totalFiles;
    private Integer frontendFiles;
    private Integer serverFiles;
    private Integer adminFiles;
    private Integer modifyCount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // getters/setters 省略，可以用 IDE 生成

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
}