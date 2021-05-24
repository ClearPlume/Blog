package top.fallenangel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("document")
public class DocumentController {

    @GetMapping("")
    public String editor() {
        return "document";
    }

    @PostMapping("newArticle")
    @ResponseBody
    public String newArticle(@RequestParam("editor-markdown-doc") String article) {
        return "article: " + article;
    }
}
