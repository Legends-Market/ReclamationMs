package tn.esprit.reclamationms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reclamations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    @Column(length = 1000)
    private String description;

    private String status;

    private LocalDateTime dateCreation;

    @PrePersist
    public void prePersist() {
        this.dateCreation = LocalDateTime.now();
        this.status = "EN_ATTENTE";
    }
}