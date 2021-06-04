package top.fallenangel.blog.dto.transfer;

import com.alibaba.fastjson.JSON;
import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.entity.ArticleEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleTransfer {
    public static ArticleEntity dto2entity(ArticleDTO dto) {
        return JSON.parseObject(JSON.toJSONString(dto), ArticleEntity.class);
    }

    public static ArticleDTO entity2dto(ArticleEntity entity) {
        return JSON.parseObject(JSON.toJSONString(entity), ArticleDTO.class);
    }

    public static List<ArticleDTO> entities2dtos(List<ArticleEntity> entities) {
        return entities.stream().map(ArticleTransfer::entity2dto).collect(Collectors.toList());
    }
}
