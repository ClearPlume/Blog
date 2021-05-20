package top.fallenangel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("editor")
public class EditorController {

    @GetMapping("")
    public String editor() {
        return "editor";
    }

    @PostMapping("submit")
    @ResponseBody
    public Object submit(@RequestParam Map<String, String> param) {
        return param;
    }
}
