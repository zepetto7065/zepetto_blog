package me.zepetto.blogboot.board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    List<Board> getList();

    Optional<Board> getBoard(Long bno);
}
