package com.cs3704.novel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Novel")
@Data
public class Novel {

    @SequenceGenerator(name = "novel_id", sequenceName = "novel_id", allocationSize = 1)
    @GeneratedValue(generator = "novel_id")

    @Id
    private Long id;

    @Column
    private String title;

//    @JsonIgnore
//    @ManyToMany(mappedBy = "novels", fetch = FetchType.LAZY)
//    private Set<Author> authors = new HashSet<>();
}
