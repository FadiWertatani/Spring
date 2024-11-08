package tn.esprit.sleam.restContoller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sleam.entity.Cours;
import tn.esprit.sleam.entity.User;
import tn.esprit.sleam.service.ICoursService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoursRestController {
    ICoursService coursService;

    @GetMapping(path = "/cours")
    List<Cours> getAllCours(){
        return coursService.getAllCours();
    }

    @PostMapping(path = "/add_cour")
    Cours ajouterCours(@RequestBody Cours cours){
        return coursService.ajouterCours(cours);
    }
}
