package tn.esprit.sleam.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sleam.entity.Cours;
import tn.esprit.sleam.entity.User;
import tn.esprit.sleam.repository.ICoursRepo;
import tn.esprit.sleam.repository.IUserRepo;
import tn.esprit.sleam.service.interafce.IUserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {
    IUserRepo userRepo;
    ICoursRepo coursRepo;
    @Override
    public User ajouterUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findOneById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User affectCourToUser(Long idUser, Long idCour) {
        //1ére étape de la récupération
        User user = userRepo.findById(idUser).orElse(null);
        Cours cours = coursRepo.findById(idCour).orElse(null);
        //2éme étape: affectation
        user.getCoursAdministration().add(cours);
        //3éme étape: persistance
        userRepo.save(user);
        return user;
    }

}
