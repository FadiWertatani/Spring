package tn.esprit.sleam.service;

import tn.esprit.sleam.entity.Chambre;

import java.util.List;


public interface IChambreService {

    Chambre ajoutChambre(Chambre chambre);

    List<Chambre> affectBlocToChambre(List<Long> numChambres, String nomBloc);

    Chambre findChambreByNumChambre(Long numChambre);

    List<Chambre> findChambreByNomUniversite(String nomUniversite);

}
