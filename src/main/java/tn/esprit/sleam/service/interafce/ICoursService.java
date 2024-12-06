package tn.esprit.sleam.service.interafce;

import tn.esprit.sleam.entity.Cours;
import tn.esprit.sleam.entity.User;

import java.util.List;

public interface ICoursService {

    List<Cours> getAllCours();
    Cours ajouterCours(Cours cours);
}
