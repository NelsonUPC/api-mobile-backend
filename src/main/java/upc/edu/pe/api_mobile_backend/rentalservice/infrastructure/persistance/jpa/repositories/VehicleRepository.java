package upc.edu.pe.api_mobile_backend.rentalservice.infrastructure.persistance.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.api_mobile_backend.rentalservice.domain.model.Vehicle;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByAvailable(Boolean available);
}
