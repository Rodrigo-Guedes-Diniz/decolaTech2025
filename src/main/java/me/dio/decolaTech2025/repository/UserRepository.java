package me.dio.decolaTech2025.repository;

import me.dio.decolaTech2025.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String AccountNumber);

}
