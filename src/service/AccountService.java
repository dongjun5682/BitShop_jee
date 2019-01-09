package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	public String createAccount(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> findAllAccounts();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public AccountBean existAccountNum(String accountNum);
	public String makeToday();
	
	public void depositChangeMoney(String accountNum,String depositMoney);
	public void withdrawalChangeMoney(String accountNum,String withdrawalMoney);
	
	public void removeAccount(String accountNum);
	
}
