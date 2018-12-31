package service;

public interface ArticleService {

	public void craeteArticle(String seq,String tilte,String content,String writer,String regdate);
	
	public void list();
	public void findByWriter(String writer);
	public void findBySeq(String seq);
	
	public void countSeq();
	public void existWriter(String writer);
	
	public void updateContent(String content);
	public void updateTilte(String tilte);
	
	public void deleteSeq(String seq);
}
