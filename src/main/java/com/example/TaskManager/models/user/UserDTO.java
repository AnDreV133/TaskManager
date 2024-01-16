package com.example.TaskManager.models.user;

import com.example.TaskManager.models.board.Board;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDTO {
    private String name;
    private String email;
    private String password;
}
