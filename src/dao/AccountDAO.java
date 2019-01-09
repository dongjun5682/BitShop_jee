package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {

	public void insertAccount(AccountBean account);
	
	public ArrayList<AccountBean> selectAllAccounts();
	public AccountBean selectAccountNum(String accountNum);
	public int countAccount();

	public boolean existAccount(String accountNum);
	
	public void updateDeposit(String accountNum,String depositMoney);
	public void updateWithdrawal(String accountNum,String withdrawalMoney);
	
	public void deleteAccount(String accountNum);
	
}
