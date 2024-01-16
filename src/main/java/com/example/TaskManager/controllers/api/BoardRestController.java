package com.example.TaskManager.controllers.api;

import com.example.TaskManager.models.board.Board;
import com.example.TaskManager.models.board.BoardDTO;
import com.example.TaskManager.models.board.BoardService;
import com.example.TaskManager.models.card.Card;
import com.example.TaskManager.models.card.CardDTO;
import com.example.TaskManager.models.card.CardRepository;
import com.example.TaskManager.models.card.CardService;
import com.example.TaskManager.models.user.UserDTO;
import com.example.TaskManager.models.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;

@RestController
@RequestMapping("/board")
public class BoardRestController {
    @Autowired
    private CardService cardService;
    @Autowired
    private BoardService boardService;
    @Autowired
    private UserService userService;


    @PostMapping("/{user_id}")
    public ResponseEntity<Board> add(@RequestBody BoardDTO dto, @PathVariable long user_id) {
        return new ResponseEntity<>(boardService.create(dto, user_id), HttpStatus.OK);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Iterable<Card>> showCards(@PathVariable("id") long id) {
//        var u1 = userService.create(new UserDTO("1", "2", "3"));
//        u1.setBoards(Collections.singleton(boardService.create(new BoardDTO("work"))));
//
//        cardService.create(
//            new CardDTO("card1", new Date().toString(), new Date(1018012).toString(), 0, "texttexttext1", board));
//        cardService.create(
//            new CardDTO("card2", new Date().toString(), new Date(984859487).toString(), 0, "texttexttext2", board));
//        cardService.create(
//            new CardDTO("card3", new Date().toString(), new Date(238794328).toString(), 0, "texttexttext3", board));
//
////        boardService
//
//        return new ResponseEntity<>(cardService.readByBoard(board), HttpStatus.OK); // поиск board по id
//    }
}
