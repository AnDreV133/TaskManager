package com.example.TaskManager.models.board;

import com.example.TaskManager.models.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private User user;
//    @OneToMany(cascade = CascadeType.ALL)
//    private Iterable<Card> cards;
}
