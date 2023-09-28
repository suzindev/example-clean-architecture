package br.com.suzintech.cleanarch.main;

import br.com.suzintech.cleanarch.application.gateway.UserGateway;
import br.com.suzintech.cleanarch.application.usecase.CreateUserInteractor;
import br.com.suzintech.cleanarch.infrastructure.controllers.UserDTOMapper;
import br.com.suzintech.cleanarch.infrastructure.gateway.UserEntityMapper;
import br.com.suzintech.cleanarch.infrastructure.gateway.UserRepositoryGateway;
import br.com.suzintech.cleanarch.infrastructure.persistence.repository.UserRepository;
import org.springframework.context.annotation.Bean;

public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository repository, UserEntityMapper mapper) {
        return new UserRepositoryGateway(repository, mapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
