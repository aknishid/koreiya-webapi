package work.gekokujo.koreiyawebapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.gekokujo.koreiyawebapi.domain.Follow;
import work.gekokujo.koreiyawebapi.repository.FollowRepository;
import work.gekokujo.koreiyawebapi.service.FollowService;

@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowRepository followRepository;

    //followする
    @Override
    public void activeRelationshipCreate(Long followId, Long inverseFollowId){
        Follow follow = new Follow();

        follow.setFollowId(followId);
        follow.setInverseFollowId(inverseFollowId);
        followRepository.save(follow);
    }



    //followを解除する
    @Override
    public void passiveRelationshipCreate(Long followId, Long inverseFollowId){

        Follow follow = followRepository.findByFollowIdAndInverseFollowId(followId, inverseFollowId);
        followRepository.delete(follow);
    }
}
