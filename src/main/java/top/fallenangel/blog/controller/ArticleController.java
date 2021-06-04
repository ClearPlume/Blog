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
        return "article/article";
    }

    @ResponseBody
    @PostMapping("newArticle")
    public ResultVO newArticle(@RequestBody ArticleDTO article) {
        return ResultVO.success(articleService.save(article));
    }

    @ResponseBody
    @GetMapping({"allArticles/{page}", "allArticles"})
    public ResultVO allArticles(@PathVariable(required = false) Integer page) {
        if (page == null || page == 0) {
            page = 0;
        } else {
            page--;
        }

        return ResultVO.success(articleService.list(page, 8));
    }
}
