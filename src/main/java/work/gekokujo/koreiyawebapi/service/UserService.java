package work.gekokujo.koreiyawebapi.service;

import work.gekokujo.koreiyawebapi.domain.Profile;
import work.gekokujo.koreiyawebapi.domain.User;

public interface UserService {

    //DBにアクセスしてDtoを返す


    //ユーザーの情報を登録する

    //followする

    //followを解除する


    Profile findProfileDetail (String userUniqueId);

    void registerUserDetail(User registerUser);


}


