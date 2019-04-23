package com.cs3704.novel.entity;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Setter @Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class author {
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
}
