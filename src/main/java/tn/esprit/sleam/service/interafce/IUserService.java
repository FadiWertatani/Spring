package tn.esprit.sleam.service.interafce;


import tn.esprit.sleam.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User ajouterUser(User user);

    List<User> getAllUsers();

    Optional<User> findOneById(Long userId);

    void deleteUserById(Long UserId);

    User updateUser(User user);

    User affectCourToUser(Long idUser, Long idCour);
}
