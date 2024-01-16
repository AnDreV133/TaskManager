package com.example.TaskManager.models.board;

import com.example.TaskManager.models.card.Card;
import com.example.TaskManager.models.card.CardDTO;
import com.example.TaskManager.models.user.User;
import com.example.TaskManager.models.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private UserRepository userRepository;

    public Board create(BoardDTO dto, long userId) {
        return boardRepository.save(Board.builder()
            .name(dto.getName())
            .user(userRepository.findById(userId).orElseThrow(() -> {
                throw new RuntimeException("not user id: %d".formatted(userId));
            }))
            .build());
    }

    public Iterable<Board> readAll() {
        return boardRepository.findAll();
    }

    public Board readById(long id) {
        return boardRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("not this id ");
        });
    }

    public Board updateName(long id, String value) {
        var res = readById(id);
        res.setName(value);
        return res;
    }
}
