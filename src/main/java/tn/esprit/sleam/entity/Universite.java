package tn.esprit.sleam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Universite {
    @Id
    private Long idUniversite;

    @Column
    String nomUniversite;

    @Column
    String adresse;

    @OneToOne
    Foyer foyer;
}
