package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDAO {


	public void insertArticle(ArticleBean article);
	
	public ArrayList<ArticleBean> selectAllArticle();
	public ArrayList<ArticleBean> selectArticleByWriters(String writer);
	public ArticleBean selectArticleBySeq(String seq);
	
	public int countArticle();
	public boolean existWriter(String writer);
	
	public void updateContent(String content);
	public void updateTilte(String tilte);
	
	public void deleteArticle(String seq);
	
}
