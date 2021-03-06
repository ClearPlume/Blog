package top.fallenangel.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "t_article")
public class ArticleEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "special_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private SpecialEntity special;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(name = "description", nullable = false, length = 55)
    private String description;

    @Column(name = "content", nullable = false, length = 10000)
    private String content;

    @Column(name = "published", nullable = false, length = 1)
    private boolean published;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;
}