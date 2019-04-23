package com.cs3704.novel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "novel")
@Setter @Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class novel {

    @SequenceGenerator(name = "novel_id", sequenceName = "novel_id", allocationSize = 1)
    @GeneratedValue(generator = "novel_id")

    @Id
    private Long id;

    @Column
    private String title;


}
