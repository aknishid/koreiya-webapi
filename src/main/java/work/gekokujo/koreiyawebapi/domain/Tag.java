package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by aini on 2018/05/20.
 */
@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "tagId")
    private Content content;
    @Size(min = 1,max = 30)
    private String tagName;
}
