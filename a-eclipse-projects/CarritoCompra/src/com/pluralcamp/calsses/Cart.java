package com.pluralcamp.calsses;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Cart implements ICart{

	//Atributos con valores por defecto que representan 
	//un carrito de la compra vacio
	private Set<Triplet<Product,Integer,Float>> lineas = new HashSet<>();
	private Float total = 0.0f;
	
	
	 //needed getters and setters

	public Set<Triplet<Product, Integer, Float>> getLineas() {
		return lineas;
	}
	
	public void setLineas(Set<Triplet<Product, Integer, Float>> lineas) {
		this.lineas = lineas;
	}
	
	public Float getTotal() {
		return total;
	}
	
	public void setTotal(Float total) {
		this.total = total;
	}
	
	
	 //Helper methods are private
    private boolean updateLine(Triplet<Product,Integer,Float> line){
        if(!lineas.contains(line)) {
            return false;
        }
        
        for(Triplet<Product,Integer,Float> row: lineas) {
        	if (row.equals(line)) { //la misma linea
        		//update de row
        		row.setK(line.getK());
        		row.setV(line.getV());
        		row.setE(line.getE());
        	}
        }
        // Iterating over the property lines //iterar hacer un foreach
        // When line is found, update it        
                     
        return true;
    } 
      
    
    private boolean cartContains(Product product){
        // Iterating over hash set items 
        // using a foreach (enhanced for loop)
        for(Triplet<Product,Integer,Float> currentLine : lineas){
            if(currentLine.getK().equals(product)){
                return true;
            }
        }
        return false;
    }
     
    
    private void updateTotal(Triplet<Product,Integer,Float> line){
        //first step: add line
    	//this.lineas.add(line); ---> cambiamos la linea a boolean 
    	//public addproduct(Product product, int amount){
    	
    	//second step
    	//actualizando el total
    	this.total += line.getE();
    	
    	//second step alternative:  update cart total
    	//Recalculando el total
//    	this.total = 0.0f;
//    	for(Triplet<Product,Integer,Float> currentLine : lineas){
    		//forma larga 
    		//this.total = this.total + currentLine.getE();
    	
    		//forma compacta
//           this.total += currentLine.getE(); //El precio de la linea           
    	//}
    	
    	//second step alternate 
    	
        //update the property "total" after adding the new line
        //"total" keeps the total price of the cart
    }
    
    //Public methods are interface implementations
    /*
    * Add an amount of units of the specified product into the cart
    * 
    * @param  product  an instance of a product to be added to the cart
    * @param amount  the number of units of the specified product to be added
    * @return true if the product was successfully added, false otherwise
    */
    @Override
    public boolean addProduct(Product product, int amount){
        //TODO
        //Create a Triplet from parameters
    	Triplet<Product,Integer,Float> newLine = new Triplet<>();
    	newLine.setK(product);;
    	newLine.setV(amount);
    	float lineTotal = product.getPrice() * amount;
    	newLine.setE(lineTotal);
    	
        //if Cart contains the triplet, update the corresponding line
    	boolean contains = this.cartContains(product);
    	
    	if (contains) {
    		this.updateLine(newLine);
    		} else {     //otherwise, add the line to the cart (to the Set)
    			this.lineas.add(newLine);
    			}
    		this.updateTotal(newLine);
    		
    		return false; //modify accordingly
    }
    /*
    * Add 1 single unit a the specified product into the cart
    * 
    * @param  product  an instance of a product to be added to the cart
    * @return true if the product was successfully added, false otherwise
    */
    @Override
    public boolean addProduct(Product product) {
        //TODO
    	return this.addProduct(product,1);
        //implementation for adding only 1 unit of the product
        //return false; //modify accordingly
    }
    @Override
    public void printCart(){
        if(lineas instanceof HashSet) System.out.println("Lines is a HashSet");
        if(lineas instanceof TreeSet) System.out.println("Lines is a TreeSet");
        String separator = "\\|";
        System.out.printf("%6s - %25s | %8s | %8s | %14s\n", "ID", "Name", 
                            "Price", "Amount", "Total Price (€)");
        for(Triplet<Product,Integer,Float> line: lineas){
            //Position 0 contains ID Product as String
            //Position 1 contains product name as String
            //Position 2 contains product price (per unit) as String
            //Position 3 contains Integer (amount) as String
            //Position 4 contains Float (total price) as String
            String[] lineArr = line.toString().split(separator);
            
            System.out.format("%6s - %25s | %8s | %8s | %14s\n", lineArr[0], lineArr[1], 
                                 lineArr[2], lineArr[3], lineArr[4]);              
        }        
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.format("%63s %8s€", "Total de la comanda:", df.format(this.total));
    }

 
}	 
