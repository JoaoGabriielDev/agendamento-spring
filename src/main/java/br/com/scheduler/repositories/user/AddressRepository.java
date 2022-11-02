package br.com.scheduler.repositories.user;

import br.com.scheduler.models.entity.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
