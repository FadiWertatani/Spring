package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    private Long idReservation;
    @Temporal(TemporalType.DATE)
    Date anneeUniversitaire;
    @Column
    Boolean isValide;
    @ManyToMany(mappedBy = "reservations")
    Set<Etudiant> etudiants;
}
