package work.gekokujo.koreiyawebapi.service;

import work.gekokujo.koreiyawebapi.domain.Profile;
import work.gekokujo.koreiyawebapi.domain.User;

public interface UserService {

    //DBにアクセスしてDtoを返す


    //ユーザーの情報を登録する

    //followする

    //followを解除する


    public Profile findProfileDetail (String userUniqueId);

    public void registerUserDetail(User registerUser);

    public void activeRelationshipCreate(Long followId, Long integerFollowId);

    public void passiveRelationshipCreate(Long followId, Long inverseFollowId);

}


