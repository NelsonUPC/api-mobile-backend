package upc.edu.pe.api_mobile_backend.rentalservice.infrastructure.persistance.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.api_mobile_backend.rentalservice.domain.model.Rent;

import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findByVehicleId(Long vehicleId);
}