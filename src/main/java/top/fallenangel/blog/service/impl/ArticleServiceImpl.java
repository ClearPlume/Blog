package top.fallenangel.blog.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.dto.transfer.ArticleTransfer;
import top.fallenangel.blog.entity.ArticleEntity;
import top.fallenangel.blog.repository.ArticleRepository;
import top.fallenangel.blog.service.IArticleService;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {this.articleRepository = articleRepository;}

    @Override
    public ArticleEntity save(ArticleDTO article) {
        Date now = new Date();
        article.setUpdateTime(now);

        if (article.getId() == null) {
            article.setCreateTime(now);
        }

        return articleRepository.save(ArticleTransfer.dto2entity(article));
    }

    @Override
    public List<ArticleDTO> list(int page, int pageSize) {
        Page<ArticleEntity> articlePage = articleRepository.findAll(PageRequest.of(page, pageSize, Sort.by("updateTime").descending()));
        return ArticleTransfer.entities2dtos(articlePage.getContent());
    }

    @Override
    public long count() {
        return articleRepository.count();
    }
}
