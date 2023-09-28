package br.com.suzintech.cleanarch.infrastructure.gateway;

import br.com.suzintech.cleanarch.domain.User;
import br.com.suzintech.cleanarch.infrastructure.persistence.database.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User dto) {
        return UserEntity.builder()
                .username(dto.username())
                .password(dto.password())
                .email(dto.email())
                .build();
    }

    User toDto(UserEntity entity) {
        return new User(entity.getUsername(), entity.getPassword(), entity.getEmail());
    }
}
