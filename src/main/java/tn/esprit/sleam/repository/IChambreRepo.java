package tn.esprit.sleam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.Bloc;
import tn.esprit.sleam.entity.Chambre;

import java.util.List;

@Repository
public interface IChambreRepo extends JpaRepository<Chambre, Long> {

    Chambre findChambreByNumChambre(Long numChambre);

    List<Chambre> findChambresByBlocFoyerUniversiteNomUniversite(String nomUniversite);

}
