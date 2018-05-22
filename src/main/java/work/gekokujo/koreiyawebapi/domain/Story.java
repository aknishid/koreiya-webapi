package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by aini on 2018/05/21.
 */
@Data
public class Story {
    private Long userId;
    private String UserUniquedId;
    private String content;
    private Timestamp createBy;
    private String contentImage;
    private List<Tag> tags;
    private Long IKnowListId;
    private Integer IKnowListCount;
    private String userName;
    private Long contentId;
}
