package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void craeteArticle(String seq,String tilte,String content,String writer,String regdate);
	
	public ArrayList<ArticleBean> findAllArticle();
	public ArrayList<ArticleBean> findArticleByWriters(String writer);
	public ArticleBean findArticleBySeq(String seq);
	
	public int countArticle();
	public boolean existWriter(String writer);
	
	public void changeContent(String content);
	public void changeTilte(String tilte);
	
	public void removeArticle(String seq);
}
