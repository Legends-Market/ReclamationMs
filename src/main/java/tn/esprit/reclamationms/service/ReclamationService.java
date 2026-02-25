package tn.esprit.reclamationms.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.reclamationms.entity.Reclamation;
import tn.esprit.reclamationms.repository.ReclamationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReclamationService {

    private final ReclamationRepository repository;

    // Save
    public Reclamation save(Reclamation reclamation) {
        return repository.save(reclamation);
    }

    // Get all
    public List<Reclamation> getAll() {
        return repository.findAll();
    }

    // Get by id
    public Reclamation getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reclamation not found"));
    }

    // Update status
    public Reclamation updateStatus(Long id, String status) {
        Reclamation reclamation = getById(id);
        reclamation.setStatus(status);
        return repository.save(reclamation);
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }
}