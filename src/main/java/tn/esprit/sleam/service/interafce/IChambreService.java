package tn.esprit.sleam.service.interafce;

import tn.esprit.sleam.entity.Chambre;

import java.util.Date;
import java.util.List;


public interface IChambreService {

    Chambre ajoutChambre(Chambre chambre);

    List<Chambre> affectBlocToChambre(List<Long> numChambres, String nomBloc);

    Chambre findChambreByNumChambre(Long numChambre);

    List<Chambre> findChambreByNomUniversite(String nomUniversite);

    List<Chambre> findChambreNotReservedByCurrentYear(Date annee);

}
