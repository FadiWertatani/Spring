package tn.esprit.sleam.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.sleam.entity.Bloc;
import tn.esprit.sleam.entity.Chambre;
import tn.esprit.sleam.entity.Reservation;
import tn.esprit.sleam.repository.IBlocRepo;
import tn.esprit.sleam.repository.IChambreRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{
    IChambreRepo chambreRepo;
    IBlocRepo blocRepo;
    List<Chambre> chambreList = null;

    @Override
    public Chambre ajoutChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public List<Chambre> affectBlocToChambre(List<Long> numChambres, String nomBloc) {
        //La recuperation
        Bloc bloc = blocRepo.findBlocByNomColumn(nomBloc);
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

    @Override
    public Chambre findChambreByNumChambre(Long numChambre) {
        return chambreRepo.findChambreByNumChambre(numChambre);
    }

    @Override
    public List<Chambre> findChambreByNomUniversite(String nomUniversite) {
        return chambreRepo.findChambresByBlocFoyerUniversiteNomUniversite(nomUniversite);
    }

    @Override
    public List<Chambre> findChambreNotReservedByCurrentYear(Date annee) {
        List<Chambre> chambres = chambreRepo.findAll();
        List<Chambre> empty = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();
        for(Chambre c : chambres){
            for (Reservation reservation : c.getReservations()){
                if((reservation.getIsValide() == true) && reservation.getAnneeUniversitaire().getYear() == annee.getYear()){
                    empty.add(c);
                }
            }
        }
        return empty;
    }

    @Scheduled(cron = "*/5 * * * * *")
    void testScheduler(){
        log.info("Test de declenchement");
    }


}
