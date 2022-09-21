package com.example.learning.jpa.jpaBookExample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;

}