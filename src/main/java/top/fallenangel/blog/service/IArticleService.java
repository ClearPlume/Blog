package top.fallenangel.blog.service;

import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.entity.ArticleEntity;

public interface IArticleService {
    ArticleEntity save(ArticleDTO article);
}
