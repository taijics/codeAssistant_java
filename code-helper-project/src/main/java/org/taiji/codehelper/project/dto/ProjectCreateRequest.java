package org.taiji.codehelper.project.dto;

public class ProjectCreateRequest {

    private String name;
    private String rootPath;
    private String frontendPath;
    private String serverPath;
    private String adminPath;

    private String description;
    private String feArch;
    private String serverArch;
    private String adminArch;

    // getters/setters ...

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
}