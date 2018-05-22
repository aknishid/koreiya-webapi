package work.gekokujo.koreiyawebapi.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by aini on 2018/05/22.
 */
@Entity
@Data
public class TagList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false,name="id")
    private Content content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false,name = "id")
    private Tag tag;
}
