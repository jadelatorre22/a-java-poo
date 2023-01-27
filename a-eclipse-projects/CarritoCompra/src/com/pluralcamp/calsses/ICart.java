package com.pluralcamp.calsses;

public interface ICart {

	public boolean addProduct(Product product); //método abstracto
    public boolean addProduct(Product product, int amount); //método abstracto
    public void printCart(); //método abstracto
    
}

