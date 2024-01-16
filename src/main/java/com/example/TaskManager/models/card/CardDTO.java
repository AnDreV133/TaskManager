package com.example.TaskManager.models.card;

import com.example.TaskManager.models.board.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CardDTO {
    private String name;
    private String publicationDate;
    private String dueDate;
    private Integer status;
    private String text;
    private Board board;
}
