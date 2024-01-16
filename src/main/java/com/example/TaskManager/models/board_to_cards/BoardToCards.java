package com.example.TaskManager.models.board_to_cards;

import com.example.TaskManager.models.board.Board;
import com.example.TaskManager.models.card.Card;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardToCards {
    @OneToMany
    private Board board;
    @ManyToOne
    private Card card;
}
