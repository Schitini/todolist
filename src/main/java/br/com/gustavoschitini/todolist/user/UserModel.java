package br.com.gustavoschitini.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
//@Getter - Somente Getters
//@Setter - Somente Setters
public class UserModel {
    
    /*
     * Se não definir nada, o default é public
     */

    //getters setters
    
    //Na hora de definir o ID, utilizar o do banco de dados e não o do Spring, olhar antes do autocomplete
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
