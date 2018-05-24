package work.gekokujo.koreiyawebapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.gekokujo.koreiyawebapi.domain.Profile;
import work.gekokujo.koreiyawebapi.domain.User;
import work.gekokujo.koreiyawebapi.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "{userUniqueId}/profile")
    public Profile findProfileDetail(@PathVariable("userUniqueId") String userUniqueId){
        Profile profile = userService.findProfileDetail(userUniqueId);
        return  profile;
    }

    @PostMapping(path = "{userUniqueId}/profile")
    public void registerUserDetail(@PathVariable("userUniqueId") User registerUser){
        userService.registerUserDetail(registerUser);
    }
}
