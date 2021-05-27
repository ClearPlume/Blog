package top.fallenangel.blog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ArticleDTO {
    private Integer id;

    @JsonProperty("article-name")
    private String title;

    @JsonProperty("editor-markdown-doc")
    private String content;

    private boolean published;
}
