package nttd.bootcamp.microservices.account.management.controller;

import lombok.extern.slf4j.Slf4j;
import nttd.bootcamp.microservices.account.management.dto.AccountDto;
import nttd.bootcamp.microservices.account.management.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping(value = "/api/v1/account")
@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/personal/afiliate")
    public Mono<AccountDto> saveAccountPersonal(@Validated @RequestBody AccountDto accountDto){
        return accountService.saveAccountClientPersonal(accountDto);
    }

    @PostMapping("/business/afiliate")
    public Mono<AccountDto> saveAccountBusiness(@Validated @RequestBody AccountDto accountDto){
        return accountService.saveAccountClientBusiness(accountDto);
    }


}

