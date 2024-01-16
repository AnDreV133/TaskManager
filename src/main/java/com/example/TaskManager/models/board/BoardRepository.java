package com.example.TaskManager.models.board;

import com.example.TaskManager.models.card.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {}
