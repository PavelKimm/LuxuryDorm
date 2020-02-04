package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Category")
public class CategoryEntity {
    @Id
    @Column(name = "CategoryID")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
}
