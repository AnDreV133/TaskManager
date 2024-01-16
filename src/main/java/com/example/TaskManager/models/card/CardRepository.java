package com.example.TaskManager.models.card;

import com.example.TaskManager.models.board.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Iterable<Card> findByBoard(Board board);
}
