package top.fallenangel.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "t_special")
public class SpecialEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "description", length = 30)
    private String description;

    @ToString.Exclude
    @org.hibernate.annotations.ForeignKey(name = "none")
    @OneToMany(mappedBy = "special", cascade = {CascadeType.DETACH})
    private List<ArticleEntity> articles;
}
