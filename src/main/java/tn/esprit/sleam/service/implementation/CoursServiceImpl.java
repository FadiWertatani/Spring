package tn.esprit.sleam.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sleam.entity.Cours;
import tn.esprit.sleam.repository.ICoursRepo;
import tn.esprit.sleam.service.interafce.ICoursService;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceImpl implements ICoursService {
    ICoursRepo coursRepo;

    @Override
    public List<Cours> getAllCours() {
        return coursRepo.findAll();
    }

    @Override
    public Cours ajouterCours(Cours cours) {
        return coursRepo.save(cours);
    }

}
