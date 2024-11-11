package tn.esprit.sleam.restContoller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sleam.entity.Chambre;
import tn.esprit.sleam.service.IChambreService;

@RestController
@AllArgsConstructor
public class ChambreRestController {

    IChambreService chambreService;

    @PostMapping("/AddChambre")
    Chambre ajoutChambre(@RequestBody Chambre chambre){
        return chambreService.ajoutChambre(chambre);
    }

    @GetMapping("/find-chambre-by-num-chambre/{numCh}")
    Chambre findChambreByNumChambre(@PathVariable Long numCh){
        return chambreService.findChambreByNumChambre(numCh);
    }

}
