package work.gekokujo.koreiyawebapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.gekokujo.koreiyawebapi.domain.Profile;
import work.gekokujo.koreiyawebapi.domain.User;
import work.gekokujo.koreiyawebapi.domain.Follow;
import work.gekokujo.koreiyawebapi.repository.FollowRepository;
import work.gekokujo.koreiyawebapi.repository.UserRepository;
import work.gekokujo.koreiyawebapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FollowRepository followRepository;

    //DBにアクセスしてProfileを返す
    @Override
    public Profile findProfileDetail (String userUniqueId){
        User user = userRepository.findByUserUniqueIdEquals(userUniqueId);

        Profile profile = new Profile();
        profile.setId(user.getId());
        profile.setUserUniqueId(user.getUserUniqueId());
        profile.setUserName(user.getName());
        profile.setIntroduction(user.getIntroduction());
        profile.setUserIcon(user.getUserIcon());

        profile.setFollowerCount(followRepository.countByFollowId(user.getId()));

        profile.setInverseFollowerCount(followRepository.countByIntegerFollowId(user.getId()));

        return profile;
    }

    //ユーザーの情報を登録する
    @Override
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


}
