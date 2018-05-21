package work.gekokujo.koreiyawebapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.gekokujo.koreiyawebapi.domain.Profile;
import work.gekokujo.koreiyawebapi.domain.User;
import work.gekokujo.koreiyawebapi.repository.UserRepository;
import work.gekokujo.koreiyawebapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //DBにアクセスしてDtoを返す
    public Profile findProfileDetail (String userUniqueId){
        Profile profile = userRepository.findOne(Long id);

        return profile;

    }

    //ユーザーの情報を登録する

    public  void registerUserDetail (User registerUser){

        User user = new User();

        user.setId(registerUser.getId());
        user.setUserUniqueId(registerUser.getUserUniqueId());
        user.setName(registerUser.getName());
        user.setMail(registerUser.getMail());
        user.setPassword(registerUser.getPassword());
        user.setIntroduction(registerUser.getIntroduction());
        user.setUserIcon(registerUser.getUserIcon());

        userRepository.save(registerUser);

    }


    //followする

    //followを解除する

}
