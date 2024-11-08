package tn.esprit.sleam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.Cours;

@Repository
public interface ICoursRepo extends JpaRepository<Cours, Long> {
}
