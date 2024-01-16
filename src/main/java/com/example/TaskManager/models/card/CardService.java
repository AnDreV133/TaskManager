package com.example.TaskManager.models.card;

import com.example.TaskManager.models.board.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    public Card create(CardDTO dto) {
        return cardRepository.save(Card.builder()
            .name(dto.getName())
            .publicationDate(dto.getPublicationDate())
            .dueDate(dto.getDueDate())
//            .status(dto.getStatus())
            .text(dto.getText())
            .board(dto.getBoard())
            .build());
    }

    public Iterable<Card> readAll() {
        return cardRepository.findAll();
    }

    public Card readById(long id) {
        return cardRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("not this id ");
        });
    }

    public Iterable<Card> readByBoard(Board board) {
        return cardRepository.findByBoard(board);
    }

    public Card updateText(long id, String value) {
        var res = readById(id);
        res.setText(value);
        return res;
    }
}
