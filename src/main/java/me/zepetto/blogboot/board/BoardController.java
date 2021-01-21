package me.zepetto.blogboot.board;

import me.zepetto.blogboot.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;


    @GetMapping("/list")
    public String list(Model m){
        m.addAttribute("boards",boardService.getList());
        return "views/board/list";
    }

    @GetMapping("/detail")
    public String detail(Model m, Long bno){
        Board board = boardService.getBoard(bno)
                .orElseThrow(() -> new ResourceNotFoundException("Board Not Found , Bno is ::: " + bno ));

        m.addAttribute("board",board);
        return "views/board/detail";
    }

    @GetMapping("/form")
    public String createForm(Model m, Long bno){
        return "views/board/form";
    }

    @PostMapping("/create")
    public String create(Board board){
        System.out.println(board.getWriter());
        System.out.println(board.getContent());

        return "redirect:/";
    }

}
