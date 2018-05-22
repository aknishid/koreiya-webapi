package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by aini on 2018/05/20.
 */
@Entity
@Data
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(min = 0,max = 140)
    private String content;

    private Long userId;

    private Timestamp createBy;

    private String contentImage;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "contentId")
    private List<TagList> tags;
}
