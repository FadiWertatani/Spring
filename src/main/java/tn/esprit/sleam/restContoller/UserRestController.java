package tn.esprit.sleam.restContoller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sleam.entity.User;
import tn.esprit.sleam.service.IUserService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserRestController {
    IUserService userService;

    @PostMapping(path = "/user")
    User ajouteruser(@RequestBody User user){
        return userService.ajouterUser(user);
    }

    @GetMapping(path = "/users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/user/{id}")
    Optional<User> findOneById(@PathVariable Long id){
        return userService.findOneById(id);
    }

    @PostMapping(path = "/delete_user/{id}")
    void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }

    @PutMapping(path = "/update_user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PutMapping("/affect_user_cour/{idUser}/{idCour}")
    public User affectCourToUser(@PathVariable("idUser") Long idUser,@PathVariable("idCour") Long idCour){
        return userService.affectCourToUser(idUser, idCour);
    }
}
