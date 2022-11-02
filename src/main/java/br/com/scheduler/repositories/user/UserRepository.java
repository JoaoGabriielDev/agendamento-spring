package br.com.scheduler.repositories.user;

import br.com.scheduler.models.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
