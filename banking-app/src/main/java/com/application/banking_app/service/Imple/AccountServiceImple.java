package com.application.banking_app.service.Imple;

import com.application.banking_app.Accountdto.AccountDto;
import com.application.banking_app.entity.Account;
import com.application.banking_app.mapper.AccountMapper;
import com.application.banking_app.repository.AccountRepository;
import com.application.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImple implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImple(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountdto) {
        Account account = AccountMapper.mapToAccount(accountdto);
        Account SavedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(SavedAccount);
    }
}
