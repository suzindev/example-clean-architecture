package br.com.suzintech.cleanarch.application.gateway;

import br.com.suzintech.cleanarch.domain.User;

public interface UserGateway {

    User createUser(User user);
}
