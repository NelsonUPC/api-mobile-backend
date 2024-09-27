package upc.edu.pe.api_mobile_backend.rentalservice.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_mobile_backend.rentalservice.domain.model.Rent;
import upc.edu.pe.api_mobile_backend.rentalservice.infrastructure.persistance.jpa.repositories.RentRepository;

import java.util.List;

@Service
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    public Rent createRent(Rent rent) {
        return rentRepository.save(rent);
    }

    public List<Rent> getAllRents() {
        return rentRepository.findAll();
    }

    public void deleteRent(Long id) {
        rentRepository.deleteById(id);
    }

    public List<Rent> getRentsByVehicleId(Long vehicleId) {
        return rentRepository.findByVehicleId(vehicleId);
    }
}
