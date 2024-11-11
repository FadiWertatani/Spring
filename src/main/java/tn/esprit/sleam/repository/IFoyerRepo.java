package tn.esprit.sleam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.Foyer;

@Repository
public interface IFoyerRepo extends JpaRepository<Foyer, Long> {

}
