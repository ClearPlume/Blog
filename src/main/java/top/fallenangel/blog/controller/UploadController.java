package top.fallenangel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.fallenangel.blog.config.UploadConfigure;
import top.fallenangel.blog.vo.UploadVO;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("uploader")
public class UploadController {
    private final UploadConfigure uploadConfigure;

    public UploadController(UploadConfigure uploadConfigure) {this.uploadConfigure = uploadConfigure;}

    @ResponseBody
    @RequestMapping("image")
    public UploadVO image(@RequestParam("editormd-image-file") MultipartFile image) {
        UploadVO upload = new UploadVO();

        try {
            String imageLogicName = image.getOriginalFilename();
            image.transferTo(new File(uploadConfigure.getImagePath() + File.separatorChar + imageLogicName));

            upload.setSuccess(1);
            upload.setMessage("Upload successful");
            upload.setUrl(uploadConfigure.getServer().getImage() + '/' + imageLogicName);
        } catch (IOException e) {
            e.printStackTrace();

            upload.setSuccess(0);
            upload.setMessage("Upload failed");
            upload.setUrl(null);
        }

        return upload;
    }
}
