package work.gekokujo.koreiyawebapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.gekokujo.koreiyawebapi.domain.Content;
import work.gekokujo.koreiyawebapi.domain.Story;
import work.gekokujo.koreiyawebapi.service.ContentService;

/**
 * Created by aini on 2018/05/24.
 */
@RestController
public class ContentController {
    @Autowired
    ContentService contentService;

    @PostMapping(path = "content")
    public void registerContentDetails(@RequestBody Content dto){
        contentService.registerContentDetail(dto);
    }

    @GetMapping(path = "content")
    public Story findOneStoryDetail(@RequestParam Long id){
        Story story = contentService.findOneStory(id);
        return story;
    }


}
