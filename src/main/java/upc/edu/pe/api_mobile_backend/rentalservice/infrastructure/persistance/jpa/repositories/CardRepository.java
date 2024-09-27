package upc.edu.pe.api_mobile_backend.rentalservice.infrastructure.persistance.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.api_mobile_backend.rentalservice.domain.model.Card;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByUserId(Long userId);
}
