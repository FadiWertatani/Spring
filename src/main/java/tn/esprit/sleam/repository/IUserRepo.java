package tn.esprit.sleam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
}
