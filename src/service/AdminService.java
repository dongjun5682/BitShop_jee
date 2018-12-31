package service;

public interface AdminService {
	
	
	public void createAdmin(String adminNum,String name,String pass,String auth);
	
	public void list();
	public void findByNam(String name);
	public void findByAdminNum(String adminNum);
	
	public void countAdminNum();
	public void existAdmin(String adminNum,String pass);
	
	public void updateAuth(String newAuth);
	
	public void deleteAdmin(String adminNum);
	
}
