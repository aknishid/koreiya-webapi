package work.gekokujo.koreiyawebapi.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.gekokujo.koreiyawebapi.domain.Content;
import work.gekokujo.koreiyawebapi.domain.Story;
import work.gekokujo.koreiyawebapi.domain.Tag;
import work.gekokujo.koreiyawebapi.domain.User;
import work.gekokujo.koreiyawebapi.repository.ContentRepository;
import work.gekokujo.koreiyawebapi.repository.TagRepository;
import work.gekokujo.koreiyawebapi.repository.UserRepository;
import work.gekokujo.koreiyawebapi.service.ContentService;

import java.util.List;

/**
 * Created by aini on 2018/05/21.
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TagRepository tagRepository;

    public List<Story> findOneStory(String UserUniqueId) throws Exception {
        Story story =  new Story();
        User user = userRepository.findByUniquedId();
        if (user == null){
            throw new Exception();
        }
        List<Content> contents = contentRepository.findByUserId(user.getId());
        for(Content content : contents){
            story.setUserId(user.getId());
            story.setUserUniquedId(user.getUserUniqueId());
            story.setContent(content.getContent());
            story.setCreateBy(content.getCreateBy());
            story.setContentImage(content.getContentImage());
            List<Tag> tags = tagRepository.findBycontent.getTagId();
            story.setTags();
        }


    }
}
