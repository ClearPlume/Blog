package top.fallenangel.blog.config;

/**
 * 服务器的URL
 */
public class ServerConfigure {
    /**
     * 上传服务器
     */
    private String upload;
    /**
     * 上传服务器的文件应用
     */
    private String file;
    /**
     * 上传服务器的图片应用
     */
    private String image;

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
