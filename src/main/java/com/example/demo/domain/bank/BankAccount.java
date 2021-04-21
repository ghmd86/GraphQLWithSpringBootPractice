package com.example.demo.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class BankAccount {
    UUID accountId;
    String firstName;
    String lastName;
    Currency currency;
}
