package com.application.banking_app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ac_name")
    private String name;
    private double balance;

    public Account(Object getid, Object getname, Object getbalance) {
    }

    public Object getid() {
        return this.id;
    }

    public Object getname() {
        return this.name;
    }

    public Object getbalance() {
        return this.balance;
    }
}
