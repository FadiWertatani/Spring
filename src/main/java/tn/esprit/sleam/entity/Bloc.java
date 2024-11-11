package tn.esprit.sleam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Bloc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idBloc;

    @Column
    String nomColumn;

    @Column
    Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set<Chambre> chambres;
}
