package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.service.posts.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts",postsService.findAllDesc());
        return "index";
    }
    /** index() 매서드 수정으로인한 주석처리
     * public String index() {
        return "index";
    }
    */

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
