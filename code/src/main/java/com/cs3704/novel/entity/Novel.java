package com.cs3704.novel.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Novel")
@Setter @Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Novel {

    @SequenceGenerator(name = "novel_id", sequenceName = "novel_id", allocationSize = 1)
    @GeneratedValue(generator = "novel_id")

    @Id
    private Long id;

    @Column
    private String title;

    @ManyToMany(mappedBy = "novels")
    private Set<Author> authors;
}
