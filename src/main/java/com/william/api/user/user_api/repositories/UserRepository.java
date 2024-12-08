package com.william.api.user.user_api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.william.api.user.user_api.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User  findByCpf(String cpf);

    List<User> queryByNomeLike(String name);
}