package top.fallenangel.blog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("upload")
public class UploadConfigure {
    /**
     * 上传服务器的文件路径
     */
    private String rootPath;
    /**
     * 上传服务器中的[图片]文件路径
     */
    private String imagePath;
    /**
     * 上传服务器中的[文件]文件路径
     */
    private String filePath;

    @NestedConfigurationProperty
    private ServerConfigure server;

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ServerConfigure getServer() {
        return server;
    }

    public void setServer(ServerConfigure server) {
        this.server = server;
    }
}
