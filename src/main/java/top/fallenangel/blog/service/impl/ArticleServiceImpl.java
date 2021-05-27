package top.fallenangel.blog.service.impl;

import org.springframework.stereotype.Service;
import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.dto.transfer.ArticleTransfer;
import top.fallenangel.blog.entity.ArticleEntity;
import top.fallenangel.blog.repository.ArticleRepository;
import top.fallenangel.blog.service.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {this.articleRepository = articleRepository;}

    @Override
    public ArticleEntity save(ArticleDTO article) {
        return articleRepository.save(ArticleTransfer.dto2entity(article));
    }
}
