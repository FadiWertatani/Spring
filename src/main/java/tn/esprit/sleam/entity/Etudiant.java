package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Etudiant {
    @Id
    private Long idEtudiant;

    @Column
    String nomEtudiant;

    @Column
    String prenomEtudiant;

    @Column
    Long cin;

    @Column
    String ecole;

    @Temporal(TemporalType.DATE)
    Date dateNaissance;

    @ManyToMany
    Set<Reservation> reservations;
}
