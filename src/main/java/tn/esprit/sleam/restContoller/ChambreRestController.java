package tn.esprit.sleam.restContoller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sleam.entity.Chambre;
import tn.esprit.sleam.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {

    IChambreService chambreService;

    @PostMapping("/AddChambre")
    Chambre ajoutChambre(@RequestBody Chambre chambre){
        return chambreService.ajoutChambre(chambre);
    }

    @PostMapping("/affectBlocToChambre/{nomBloc}")
    List<Chambre> affectBlocToChambre(@RequestBody List<Long> numChambres, @PathVariable("nomBloc") String nomBloc){
        return chambreService.affectBlocToChambre(numChambres, nomBloc);
    }

    @GetMapping("/find-chambre-by-num-chambre/{numCh}")
    Chambre findChambreByNumChambre(@PathVariable Long numCh){
        return chambreService.findChambreByNumChambre(numCh);
    }

    @GetMapping("/find-chambre-by-nom-universite/{nom}")
    List<Chambre> findChambresByNomUni(@PathVariable String nom){
        return chambreService.findChambreByNomUniversite(nom);
    }

}
