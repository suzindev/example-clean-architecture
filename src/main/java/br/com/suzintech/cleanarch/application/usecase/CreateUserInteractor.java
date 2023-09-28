package br.com.suzintech.cleanarch.application.usecase;

import br.com.suzintech.cleanarch.application.gateway.UserGateway;
import br.com.suzintech.cleanarch.domain.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserInteractor {

    private final UserGateway userGateway;

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
