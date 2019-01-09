package service;

import java.util.ArrayList;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService{

	private static AdminServiceImpl instance = new AdminServiceImpl();
	
	private AdminServiceImpl() {}
	public static AdminServiceImpl getInstance() {	return instance;	}

	@Override
	public void createAdmin(String adminNum, String name, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> findAllAdmin() {
		ArrayList<AdminBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<AdminBean> findAdminByNames(String name) {
		ArrayList<AdminBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public AdminBean findAdminByAdminNum(String adminNum) {
		AdminBean admin = new AdminBean();
		return admin;
	}

	@Override
	public int countAdmins() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existAdmin(String adminNum, String pass) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void changeAuth(String newAuth) {
		
	}

	@Override
	public void removeAdmin(String adminNum) {
		
	}

}
