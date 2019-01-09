package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	
	private static AccountServiceImpl instance = new AccountServiceImpl();
	
	private AccountServiceImpl(){
		list = new ArrayList<>();
	}
	public static AccountServiceImpl getInstance(){return instance;}
	
	ArrayList<AccountBean> list;

	@Override
	public String createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(makeToday());
		String accountNum = account.getAccountNum();
		list.add(account);
		return accountNum;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (account.equals(list.get(i).getAccountNum())) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String accountNum = "";
		for (int i = 0; i < 8; i++) {
			if (i != 3) {
				accountNum += random.nextInt(10);
			} else {
				accountNum += random.nextInt(10) + "-";
			}
		}
		return accountNum;
	}

	@Override
	public String makeToday() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	@Override
	public ArrayList<AccountBean> findAllAccounts() {
		ArrayList<AccountBean> list = new ArrayList<>();
		return list;

	}

	@Override
	public int countAccount() {
		int count = 0;
		return count;
	}

	@Override
	public AccountBean existAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		return account;
	}

	@Override
	public void depositChangeMoney(String accountNum, String depositMoney) {
	}

	@Override
	public void withdrawalChangeMoney(String accountNum, String withdrawalMoney) {

	}

	@Override
	public void removeAccount(String accountNum) {

	}

}
