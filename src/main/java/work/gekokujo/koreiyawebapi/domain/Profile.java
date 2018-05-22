package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

@Data
public class Profile {

    private Long id;

    private String userUniqueId;

    private String userName;

    private String introduction;

    private String userIcon;

    private Integer followerCount;

    private Integer InverseFollowCount;

}
