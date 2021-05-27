package top.fallenangel.blog.dto.transfer;

import com.alibaba.fastjson.JSON;
import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.entity.ArticleEntity;

public class ArticleTransfer {
    public static ArticleEntity dto2entity(ArticleDTO dto) {
        return JSON.parseObject(JSON.toJSONString(dto), ArticleEntity.class);
    }
}
