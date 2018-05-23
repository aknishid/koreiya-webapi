package work.gekokujo.koreiyawebapi.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import work.gekokujo.koreiyawebapi.domain.*;
import work.gekokujo.koreiyawebapi.repository.ContentRepository;
import work.gekokujo.koreiyawebapi.repository.IKnowListRepository;
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

    @Autowired
    private IKnowListRepository iKnowListRepository;

    public Story findOneStory(Long contentId){
        Content content = contentRepository.findOne(contentId);
        Long iknowListCount = iKnowListRepository.countByContentId(contentId);
        Story story = new Story();

        story.setUserId(content.getUser().getId());
        story.setUserUniquedId(content.getUser().getUserUniqueId());
        story.setContentText(content.getContent());
        story.setCreateBy(content.getCreateBy());
        story.setContentImage(content.getContentImage());
        story.setIKnowListId(content.getId());
        story.setIKnowListCount(iknowListCount);
        story.setTags(null);

        return story;
    }
}
