package dao;


import java.sql.ResultSet;

import java.util.ArrayList;

import domain.ArticleBean;
import factory.DatabaseFactory;

public class ArticleDAOImpl implements ArticleDAO {

	private static ArticleDAOImpl instance = new ArticleDAOImpl();
	private ArticleDAOImpl(){}
	public static ArticleDAOImpl getInstance() {return instance;}
	
	private ResultSet rs;
	
	@Override
	public void insertArticle(ArticleBean article) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<ArticleBean> selectAllArticle() {
		ArrayList<ArticleBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ArrayList<ArticleBean> selectArticleByWriters(String writer) {
		ArrayList<ArticleBean> list = new ArrayList<>();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ArticleBean selectArticleBySeq(String seq) {
		ArticleBean article = new ArticleBean();
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return article;
	}

	@Override
	public int countArticle() {
		int count = 0;
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public boolean existWriter(String writer) {
		boolean exist = false;
		try {
			String sql = "select * from member";
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(sql);

			while(rs.next()){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exist;
	}

	@Override
	public void updateContent(String content) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateTilte(String tilte) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteArticle(String seq) {
		try {
			String sql = String.format("", "");
			int a = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeUpdate(sql);
			if(a==1){
				System.out.println("성공");
			}else{
				System.out.println("실패");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
