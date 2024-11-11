package tn.esprit.sleam.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sleam.entity.Bloc;
import tn.esprit.sleam.repository.IBlocRepo;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    IBlocRepo blocRepo;

    @Override
    public Bloc ajoutBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Optional<Bloc> findBlocById(Long id) {
        return blocRepo.findById(id);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepo.findAll();
    }
}
