package ru.cft.shift.luxury_dorm.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @Column(name = "ProductID")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Photo")
    private String photo;
    @Column(name = "Price")
    private Float price;
    @ManyToOne(cascade = CascadeType.ALL)
    private CategoryEntity category;
}
