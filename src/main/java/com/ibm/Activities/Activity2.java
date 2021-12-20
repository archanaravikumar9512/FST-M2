package com.ibm.Activities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.ibm.Activities.BankAccount.NotEnoughFundsException;

public class Activity2 {
	
@Test
void notEnoughFunds() {
 
    BankAccount account = new BankAccount(9);
    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
}
//FST Training 
@Test
void enoughFunds() {
BankAccount account = new BankAccount(100);
assertDoesNotThrow(() -> account.withdraw(100));
}
}
