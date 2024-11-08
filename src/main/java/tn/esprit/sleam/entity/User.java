package tn.esprit.sleam.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idUser;
    @Column
    String nom;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    LocalDate dateNaissance;
    @ManyToOne()
    Cours cours;
    @ManyToMany
    Set<Cours> coursAbonnement;
    @ManyToMany
    Set<Cours> coursAdministration;
}
