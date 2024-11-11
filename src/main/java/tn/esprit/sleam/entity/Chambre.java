package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.sleam.constants.TypeChambre;

import java.util.Set;

@Entity
@Getter
@Setter
public class Chambre {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idChambre;
    @Column
    Long numChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    Set<Reservation> reservations;
}
