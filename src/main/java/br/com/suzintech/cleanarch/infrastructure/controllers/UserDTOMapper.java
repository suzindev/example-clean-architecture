package br.com.suzintech.cleanarch.infrastructure.controllers;

import br.com.suzintech.cleanarch.domain.User;
import br.com.suzintech.cleanarch.infrastructure.controllers.request.CreateUserRequest;
import br.com.suzintech.cleanarch.infrastructure.controllers.response.CreateUserResponse;

public class UserDTOMapper {

    public CreateUserResponse toResponse(User dto) {
        return new CreateUserResponse(dto.username(), dto.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
