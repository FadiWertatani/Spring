package tn.esprit.sleam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.Bloc;

@Repository
public interface IBlocRepo extends JpaRepository<Bloc, Long> {
    Bloc findBlocByNomColumn(String nomBloc);

}
