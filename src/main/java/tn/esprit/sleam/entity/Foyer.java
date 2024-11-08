package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Foyer {
    @Id
    private Long idFoyer;

    @Column
    String nomFoyer;

    @Column
    Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    Universite universite;

    @OneToMany(mappedBy = "foyer")
    Set<Bloc> bloc;
}
