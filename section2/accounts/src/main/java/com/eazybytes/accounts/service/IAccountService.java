package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /*
     * @param -CustomDto Object
     */

    void createAccount(CustomerDto customerDto);
}
