package service;

import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{

	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	
	private ArticleServiceImpl() {	}

	public static ArticleServiceImpl getInstance() {return instance;}
	
	@Override
	public void craeteArticle(String seq, String tilte, String content, String writer, String regdate) {
		
	}

	@Override
	public ArrayList<ArticleBean> findAllArticle() {
		ArrayList<ArticleBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<ArticleBean> findArticleByWriters(String writer) {
		ArrayList<ArticleBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArticleBean findArticleBySeq(String seq) {
		ArticleBean article = new ArticleBean();
		return article;
	}

	@Override
	public int countArticle() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existWriter(String writer) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void changeContent(String content) {
		
	}

	@Override
	public void changeTilte(String tilte) {
		
	}

	@Override
	public void removeArticle(String seq) {
		
	}

}
