package com.pluralcamp.factory;

import java.util.List;

import com.pluralcamp.factory.entities.pages.Page;
import com.pluralcamp.factory.entities.websites.Blog;
import com.pluralcamp.factory.entities.websites.Shop;
import com.pluralcamp.factory.entities.websites.Website;
import com.pluralcamp.factory.entities.websites.WebsiteType;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//noFactory();
		
		factory(WebsiteType.BLOG);
		
		System.out.println("--------------------");
	
		factory(WebsiteType.SHOP);
		
	}
	
	
	private static void factory(WebsiteType siteType) {
			
		Website site = WebsiteFactory.getWebsite(siteType);
		
		List<Page> pages = site.getPages();
		
		for(Page page: pages) {
			System.out.println(page);
		}
	}
		
	
	
	
	private static void noFactory() {
			
		
		Website site = new Shop();
		
		List<Page> pages = site.getPages();
		
			for(Page page: pages) {
				System.out.println(page);
			}
		
		System.out.println("--------------------");
		
		Website site2 = new Blog();
		
		List<Page> pages2 = site2.getPages();
		
			for(Page page: pages2) {
				System.out.println(page);
			}
		}
	}



