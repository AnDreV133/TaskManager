package com.example.TaskManager.models.card;

import com.example.TaskManager.models.board.Board;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String publicationDate;
    private String dueDate;
    private String text;
    @ManyToOne
//    @JoinColumn(name= "board_id")
    private Board board;
//    @ManyToOne
//    private Status status;
}
