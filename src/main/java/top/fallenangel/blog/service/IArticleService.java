package top.fallenangel.blog.service;

import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.entity.ArticleEntity;

import java.util.List;

public interface IArticleService {
    ArticleEntity save(ArticleDTO article);

    List<ArticleDTO> list(int page, int pageSize);

    long count();
}
