package tn.esprit.sleam.repository;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.sleam.entity.User;

import java.util.List;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    //1ér methode
    //récuperer la liste des user par cour
    List<User> findUsersByCoursAdministrationNomCours(String nomCours);

    //2éme methode
    //JPQL: JAVA Persistance Query Language
    @Query("select  user from User user join user.coursAdministration coursAdmin where coursAdmin.nomCours=:nom")
    List<User> usersParNomCours(@Param("nom") String nom);

}
