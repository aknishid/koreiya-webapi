package work.gekokujo.koreiyawebapi.dto;

import lombok.Data;

@Data
public class ProfileDto {

    private Long id;
    private  String userUniqueId;
    private String userName;
    private String introduction;
    private String userIcon;
    private Integer followerCount;
    private Integer inverseFollowerCount

}
