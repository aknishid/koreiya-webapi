package work.gekokujo.koreiyawebapi.service;

import work.gekokujo.koreiyawebapi.domain.Content;
import work.gekokujo.koreiyawebapi.domain.Story;

/**
 * Created by aini on 2018/05/21.
 */
public interface ContentService {
    void registerContentDetail(Content dto);
    Story findOneStory(Long contentId);
}
