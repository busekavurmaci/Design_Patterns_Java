package Memento_Article;

public class Main {

	public static void main(String[] args) {
		
		Article article1 = new Article(1, "My publication article in the first journal");
		Article article2 = new Article(2, "My publication article in the second journal");
		
		article1.setContent("Article 1 Content");
		System.out.println(article1);
		
		ArticleMemento memento = article2.createMemento();
		article2.setContent("Article 2 Content");
		System.out.println(article2);
		
		article1.restore(memento);
		article1.setContent("Restored Memento Content");
		System.out.println(article1);

		
	}

}
