package com.example.TaskManager.models.user;

import com.example.TaskManager.models.board.Board;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
//    @OneToMany(cascade = CascadeType.ALL)
//    private Iterable<Board> boards;
}
