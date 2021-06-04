package top.fallenangel.blog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ArticleDTO {
    private Integer id;

    private String title;

    private String description;

    @JsonProperty("editor-markdown-doc")
    private String content;

    private boolean published;

    @JsonFormat(pattern = "yyyy-MM-dd HH:MM:ss", timezone = "Asia/Shanghai")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:MM:ss", timezone = "Asia/Shanghai")
    private Date updateTime;
}
