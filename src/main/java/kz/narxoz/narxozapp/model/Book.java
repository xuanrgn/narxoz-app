package kz.narxoz.narxozapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String author;

    private String category;

    private int year;

    @ManyToOne
    private User owner;

}
