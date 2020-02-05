package ru.cft.shift.luxury_dorm.entity;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
