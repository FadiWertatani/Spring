package tn.esprit.sleam.service;

import tn.esprit.sleam.entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {

    Bloc ajoutBloc(Bloc bloc);

    Optional<Bloc> findBlocById(Long id);

    List<Bloc> getAllBloc();

}
