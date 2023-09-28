package br.com.suzintech.cleanarch.infrastructure.controllers.request;

public record CreateUserRequest(String username, String password, String email) {
}
