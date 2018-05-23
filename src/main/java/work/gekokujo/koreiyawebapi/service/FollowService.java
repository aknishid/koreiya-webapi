package work.gekokujo.koreiyawebapi.service;

import java.util.List;

public interface FollowService {

    void activeRelationshipCreate(Long followId, Long integerFollowId);

    void passiveRelationshipCreate(Long followId, Long inverseFollowId);




}
