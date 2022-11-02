package br.com.scheduler.repositories.user;

import br.com.scheduler.models.entity.user.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
