package com.peppermint100.dockerpractice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity(name = "ORDER_TABLE")
@Getter
@ToString
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String coffeeName;
    private String description;

    private int amount;

    public Order(String coffeeName, String description, int amount) {
        this.coffeeName = coffeeName;
        this.description = description;
        this.amount = amount;
    }
}
