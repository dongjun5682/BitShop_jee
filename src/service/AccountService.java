package service;

import domain.AccountBean;

public interface AccountService {
	
	public String openAccount(int money);
	public String createAccountNum();
	public void list();
	public AccountBean findByAccountNum(String accountNum);
	public void countAccountNum();
	public AccountBean existAccountNum(String accountNum);
	public String makeToday();
	
	public void depositUpdate(String accountNum);
	public void withdrawalUpdate(String accountNum);
	
	public void deleteAccountNum(String accountNum);
	
}
