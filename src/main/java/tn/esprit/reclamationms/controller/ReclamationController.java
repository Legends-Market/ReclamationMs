package tn.esprit.reclamationms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.reclamationms.entity.Reclamation;
import tn.esprit.reclamationms.service.ReclamationService;

import java.util.List;

@RestController
@RequestMapping("/reclamations")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ReclamationController {

    private final ReclamationService reclamationService;

    // ✅ Create Reclamation
    @PostMapping
    public Reclamation createReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.save(reclamation);
    }

    // ✅ Get All Reclamations
    @GetMapping
    public List<Reclamation> getAllReclamations() {
        return reclamationService.getAll();
    }

    // ✅ Get Reclamation By ID
    @GetMapping("/{id}")
    public Reclamation getReclamationById(@PathVariable Long id) {
        return reclamationService.getById(id);
    }

    // ✅ Update Status
    @PutMapping("/{id}/status")
    public Reclamation updateStatus(@PathVariable Long id,
                                    @RequestParam String status) {
        return reclamationService.updateStatus(id, status);
    }

    // ✅ Delete Reclamation
    @DeleteMapping("/{id}")
    public void deleteReclamation(@PathVariable Long id) {
        reclamationService.delete(id);
    }
}