package br.com.suzintech.cleanarch.infrastructure.persistence.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    private Long id;

    private String username;

    private String password;

    private String email;
}
