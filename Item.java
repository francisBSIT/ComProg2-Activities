class Item {
protected String item_name;
protected double price;
protected int sold ;
protected int stock;

public Item(String item_name, double price, int stock){
this.item_name = item_name;
this.price = price;
sold = 0;
this.stock = stock;  
}  
	public void logDetails(){
	System.out.println("Item name: "+item_name);
	System.out.println("Price: "+price);
	System.out.println("Stock: "+stock);
	System.out.println("Sold: "+sold);
	if (stock <= 0) {
        System.out.println("We are out of stock");
		System.out.println("Thank You For Shopping");
	} else if (sold == 0){
        System.out.println("You have returned all the products you have");
	    System.out.println("Thank You For Shopping");	
    } else {
		System.out.println("Thank You For Shopping");
	}
	}
	
	public void buy(){
        sold++;
        stock--;
}
    
	public void Return(){
	stock++;
	sold--;
	}
	
}