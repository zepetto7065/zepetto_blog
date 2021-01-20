package me.zepetto.blogboot.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<Board> getList() {
        return boardRepository.findAll();
    }

    @Override
    public Optional<Board> getBoard(Long bno) {
        return boardRepository.findById(bno);
    }
}
