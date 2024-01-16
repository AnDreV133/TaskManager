package com.example.TaskManager.models.user;

import com.example.TaskManager.models.board.Board;
import com.example.TaskManager.models.card.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
