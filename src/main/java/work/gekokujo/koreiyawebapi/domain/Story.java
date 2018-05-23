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
    private String contentText;
    private Timestamp createBy;
    private String contentImage;
    //content.getIdと同様
    private Long IKnowListId;
    private Long IKnowListCount;
    private String userName;
    private List<Tag> tags;
}
