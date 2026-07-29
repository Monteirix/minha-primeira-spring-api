package com.minha_primeira_api.Mtech.repositories;

import com.minha_primeira_api.Mtech.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
