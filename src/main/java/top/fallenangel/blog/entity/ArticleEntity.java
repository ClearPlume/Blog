package top.fallenangel.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

    @Column(name = "title", length = 30)
    private String title;

    @Column(name = "content", length = 10000)
    private String content;

    @Column(name = "published", length = 1)
    private boolean published;
}