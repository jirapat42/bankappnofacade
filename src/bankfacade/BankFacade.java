/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import bankcustomers.MyFacade;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
      ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(11111);
       cust1Accounts.add(acc); //acc1ofcus1
       acc = new BankAccount(11112);
       cust1Accounts.add(acc); //acc2ofcus1
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
       
       
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       acc = new BankAccount(11121);
       cust2Accounts.add(acc); //acc1ofcus2
       acc = new BankAccount(11122);
       cust2Accounts.add(acc); //acc2ofcus2
       CustomerIf cust2 = new BankCustomer("Snow", cust2Accounts);
      
       
       MyFacade obj = MyFacade.getMyFacade();
       
       obj.doDeposit(500.00, cust1, 11111);
       obj.doDeposit(1500.00, cust1, 11112);
       
       obj.doDeposit(2400.00, cust2, 11121);
       obj.doDeposit(6500.00, cust2, 11122);
       
       obj.getbankAccount(cust1, 11111);
       obj.getbankAccount(cust1, 11112);
       
       obj.getbankAccount(cust2, 11121);
       obj.getbankAccount(cust2, 11122);
       
       obj.getBanCustomer(cust1);
       
    }
    
}
