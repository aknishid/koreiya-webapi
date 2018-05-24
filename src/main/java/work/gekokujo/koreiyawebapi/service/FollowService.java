package work.gekokujo.koreiyawebapi.service;

import java.util.List;

public interface FollowService {

    void activeRelationshipCreate(String followId, String integerFollowId);

    void passiveRelationshipCreate(String followId, String inverseFollowId);




}
