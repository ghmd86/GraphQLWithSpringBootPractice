package com.example.demo.resolver;

import com.example.demo.domain.bank.BankAccount;
import com.example.demo.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankAcccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID accountId) {
        return BankAccount.builder().accountId(accountId).firstName("Ghulam").lastName("Mohammed").currency(Currency.USD).build();
    }
}
