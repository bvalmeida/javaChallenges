package br.com.automacaoapi.repository;

import br.com.automacaoapi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
