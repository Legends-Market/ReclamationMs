package tn.esprit.reclamationms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.reclamationms.entity.Reclamation;

public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
}