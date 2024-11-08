package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.sleam.constants.Categorie;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode 

public class Cours {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idCours;
    @Column
    String nomCours;
    @Enumerated(EnumType.STRING)
    Categorie categorie;
    @ManyToMany(mappedBy = "coursAdministration")
    Set<User> userAdministration;
}
