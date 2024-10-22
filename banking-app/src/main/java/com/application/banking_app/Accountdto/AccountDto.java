package com.application.banking_app.Accountdto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    
    private Long id;
    private String name;
    private double balance;

    public AccountDto(Object getid, Object getname, Object getbalance) {
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
