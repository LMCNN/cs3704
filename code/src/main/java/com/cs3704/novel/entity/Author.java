package com.cs3704.novel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//@EqualsAndHashCode(exclude = "novels")

@Entity
@Table(name = "Author")
@Data
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

    public String getName(){
        return this.name;
    }

    public String getContact(){
        return this.contact;
    }

    public String getPassword(){
        return this.password;
    }

//    @JsonIgnore
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "author_novel",
//            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "novel_id", referencedColumnName = "id")
//    )
//    Set<Novel> novels;
}
