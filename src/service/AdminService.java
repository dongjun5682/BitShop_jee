package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	
	
	public void createAdmin(String adminNum,String name,String pass,String auth);
	
	public ArrayList<AdminBean> findAllAdmin();
	public ArrayList<AdminBean> findAdminByNames(String name);
	public AdminBean findAdminByAdminNum(String adminNum);
	
	public int countAdmins();
	public boolean existAdmin(String adminNum,String pass);
	
	public void changeAuth(String newAuth);
	
	public void removeAdmin(String adminNum);
	
}
