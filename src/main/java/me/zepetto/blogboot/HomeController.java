package me.zepetto.blogboot;

import me.zepetto.blogboot.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public String index(Model m){
        m.addAttribute("board", boardService.getList());
        return "views/index";
    }

}
