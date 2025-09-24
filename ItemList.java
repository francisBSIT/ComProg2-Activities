import java.util.Scanner;

public class ItemList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Item item = new Item("Milo", 12.00, 3);
		item.buy();
		item.buy();
		item.buy();
		item.buy();
		item.Return();
		item.logDetails();
		
		scan.close();
}
}		


