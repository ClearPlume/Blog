package top.fallenangel.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fallenangel.blog.entity.ArticleEntity;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
}
