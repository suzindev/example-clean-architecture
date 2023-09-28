package br.com.suzintech.cleanarch.infrastructure.gateway;

import br.com.suzintech.cleanarch.application.gateway.UserGateway;
import br.com.suzintech.cleanarch.domain.User;
import br.com.suzintech.cleanarch.infrastructure.persistence.database.UserEntity;
import br.com.suzintech.cleanarch.infrastructure.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository repository;

    private final UserEntityMapper mapper;

    @Override
    public User createUser(User dto) {
        UserEntity entity = mapper.toEntity(dto);
        UserEntity savedObj = repository.save(entity);

        return mapper.toDto(savedObj);
    }
}
