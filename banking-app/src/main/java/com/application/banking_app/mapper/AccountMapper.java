package com.application.banking_app.mapper;

import com.application.banking_app.Accountdto.AccountDto;
import com.application.banking_app.entity.Account;
import org.jetbrains.annotations.NotNull;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountdto){
        Account account = new Account(
                accountdto.getid(),
                accountdto.getname(),
                accountdto.getbalance()
        );
        return account;
    }

    public static  AccountDto mapToAccountDto(@NotNull Account account){
        AccountDto accountDto=new AccountDto(
          account.getid(),
          account.getname(),
          account.getbalance()
        );
        return accountDto;
    }

}
