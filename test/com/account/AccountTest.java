package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void accountObjectIsNotNullTest(){
        assertNotNull(account);
    }
    @Test
    void accountObjectReceiveDepositTest(){
        account.depositMoney(2500);
        assertEquals(2500, account.getAccountBalance());

        account.depositMoney(5_000);
        assertEquals(7500, account.getAccountBalance());
    }
    @Test
    void accountWillNotTakeNegativeAmountTest( ){
        account.depositMoney(5000);
        account.depositMoney(-1500);
        int accountBalance = account.getAccountBalance();
        assertEquals(5000,accountBalance);
    }
    @Test
    void  accountWithdrawCash(){
        account.depositMoney(4000);
        account.withdrawCash(3000);
        assertEquals(1000, account.getAccountBalance());
    }
    @Test
    void accountWithdrawWithPin(){
        account.depositMoney(5000);
        account.pinWithdrawal(3000,2344);
        assertEquals(2000,account.getAccountBalance());
    }
    @Test
    void accountWithWrongPin(){
        account.depositMoney(7000);
        account.pinWithdrawal(3000,4444);
        assertEquals(7000,account.getAccountBalance());
    }
  @Test
  void accountWithdrawBeyondBalance(){
      account.depositMoney(5000);
      account.pinWithdrawal(5000,2344);
      assertEquals(5000,account.getAccountBalance());
  }

}