package tn.esprit.sleam.service;

import tn.esprit.sleam.entity.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> affectBlocToChambre(List<Long> numChambres, String nomBloc);

}
