package top.fallenangel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.fallenangel.blog.dto.ArticleDTO;
import top.fallenangel.blog.service.IArticleService;
import top.fallenangel.blog.vo.ResultVO;

@Controller
@RequestMapping("article")
public class ArticleController {
    private final IArticleService articleService;

    public ArticleController(IArticleService articleService) {this.articleService = articleService;}

    @GetMapping("")
    public String editor() {
        return "article";
    }

    @PostMapping("newArticle")
    @ResponseBody
    public ResultVO newArticle(@RequestBody ArticleDTO article) {
        return ResultVO.success(articleService.save(article));
    }
}
