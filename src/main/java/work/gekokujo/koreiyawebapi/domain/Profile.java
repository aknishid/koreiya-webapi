package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

@Data
public class Profile {

    private String userUniqueId;

    private String userName;

    private String introduction;

    private String userIcon;

    private Long followerCount;

    private Long InverseFollowerCount;

}
