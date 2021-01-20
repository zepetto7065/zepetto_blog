package me.zepetto.blogboot.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;


    @GetMapping("/blog")
    public String blog(){
        return "views/board/list";
    }

    @GetMapping("/post")
    public String post(){
        return "views/board/form";
    }

}
