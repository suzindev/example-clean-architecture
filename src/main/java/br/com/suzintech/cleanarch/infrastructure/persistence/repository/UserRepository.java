package br.com.suzintech.cleanarch.infrastructure.persistence.repository;

import br.com.suzintech.cleanarch.infrastructure.persistence.database.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
