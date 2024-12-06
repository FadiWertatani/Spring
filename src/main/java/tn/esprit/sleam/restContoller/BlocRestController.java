package tn.esprit.sleam.restContoller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sleam.entity.Bloc;
import tn.esprit.sleam.service.interafce.IBlocService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class BlocRestController {

    IBlocService blocService;

    @PostMapping("/AddBloc")
    Bloc ajoutBloc(@RequestBody Bloc bloc){
        return blocService.ajoutBloc(bloc);
    }

    @GetMapping("/findBlocById/{id}")
    Optional<Bloc> findBlocById(@PathVariable Long id){
        return blocService.findBlocById(id);
    }

    @GetMapping(path = "/blocs")
    List<Bloc> getAllBlocs(){
        return blocService.getAllBloc();
    }

}
