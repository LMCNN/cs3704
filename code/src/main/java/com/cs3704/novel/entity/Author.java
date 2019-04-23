package com.cs3704.novel.entity;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Author")
@Setter @Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Author {
    @SequenceGenerator(name = "author_id", sequenceName = "author_id", allocationSize = 1)
    @GeneratedValue(generator = "author_id")

    @Id
    private Long id;

    @Column @UniqueElements
    private String userName;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String contact;

    @ManyToMany
    @JoinTable(
            name = "contribute",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "novel_id"))
    Set<Novel> novels;
}
