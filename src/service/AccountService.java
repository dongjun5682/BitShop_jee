package service;

public interface AccountService {

	public void createAccountNum(int money);
	
	public void list();

	public void countAccountNum();
	public void existAccountNum(String accountNum);
	
	public void depositUpdate(String accountNum);
	public void withdrawalUpdate(String accountNum);
	
	public void deleteAccountNum(String accountNum);
	
}
