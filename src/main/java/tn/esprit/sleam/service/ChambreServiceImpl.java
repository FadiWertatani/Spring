package tn.esprit.sleam.service;

import tn.esprit.sleam.entity.Bloc;
import tn.esprit.sleam.entity.Chambre;
import tn.esprit.sleam.entity.Cours;
import tn.esprit.sleam.entity.User;
import tn.esprit.sleam.repository.IBlocRepo;
import tn.esprit.sleam.repository.IChambreRepo;
import tn.esprit.sleam.repository.IUserRepo;

import java.util.List;

public class ChambreServiceImpl implements IChambreService{
    IChambreRepo chambreRepo;
    IBlocRepo blocRepo;
    @Override
    public List<Chambre> affectBlocToChambre(List<Long> numChambres, String nomBloc) {
        //La recuperation
        Bloc bloc = blocRepo.findBlocByNomColumn(nomBloc);
        List<Chambre> chambreList = null;
        for(int i=0;i<numChambres.size();i++){
            chambreList.add(chambreRepo.findChambreByNumChambre(numChambres.get(i)));
        }
        //Affectation
        for (int i = 0; i < chambreList.size(); i++){
            chambreList.get(i).setBloc(bloc);
        }
        //Persistance
        return chambreRepo.saveAll(chambreList);
    }
}