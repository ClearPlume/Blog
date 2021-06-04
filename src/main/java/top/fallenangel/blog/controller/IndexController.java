package top.fallenangel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.fallenangel.blog.service.IArticleService;

@Controller
public class IndexController {
    private final IArticleService articleService;

    public IndexController(IArticleService articleService) {this.articleService = articleService;}

    @GetMapping({"/{page}", "/"})
    public String index(Model model, @PathVariable(required = false) Integer page) {
        if (page == null || page == 0) {
            page = 0;
        } else {
            page--;
        }

        model.addAttribute("articleCount", articleService.count());
        model.addAttribute("articles", articleService.list(page, 8));
        model.addAttribute("page", page + 1);

        return "index";
    }
}
