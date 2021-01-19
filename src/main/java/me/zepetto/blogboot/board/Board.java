package me.zepetto.blogboot.board;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name="board")
public class Board {

    @Id
    @GeneratedValue
    private Long bno;

    private String title;
    private String content;
    private String writer;

}
