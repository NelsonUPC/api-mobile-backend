package upc.edu.pe.api_mobile_backend.rentalservice.infrastructure.persistance.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.api_mobile_backend.rentalservice.domain.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
