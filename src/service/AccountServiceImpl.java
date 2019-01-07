package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list =new ArrayList<>();
	}
	@Override
	public String openAccount(int money) {
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
		System.out.println(account);
		return account;
	}

	
	
	@Override
	public String createAccountNum() {
		Random random = new Random();
		String accountNum="";
		for (int i = 0; i < 8; i++) {
			if(i != 3){
				accountNum += random.nextInt(10);
			}else{
				accountNum += random.nextInt(10)+"-";
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
	public void list() {
		// TODO Auto-generated method stub

	}

	@Override
	public void countAccountNum() {
		// TODO Auto-generated method stub

	}

	@Override
	public AccountBean existAccountNum(String accountNum) {
		AccountBean account = new AccountBean();

		return account;
	}

	@Override
	public void depositUpdate(String accountNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawalUpdate(String accountNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub

	}


}
