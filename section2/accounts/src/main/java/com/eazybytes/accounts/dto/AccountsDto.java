package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data

public class AccountsDto {

    private String acccountNumber;

    private String accountType;

    private String branchAddress;

}
