package com.pluralcamp.factory.entities.websites;

import com.pluralcamp.factory.entities.pages.*;


public class Blog extends Website {

	private String tittle;
	
	public Blog() {
		super();
	}
	
	
		public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}




		@Override
		public void CreateWebstie() {
			pages.add(new PostPage());
			pages.add(new ContactPage());
			pages.add(new SearchPage());
			pages.add(new CommentPage());
			pages.add(new AboutPage());
			
	}
}
