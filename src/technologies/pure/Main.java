package technologies.pure;

import technologies.pure.data.Product;
import technologies.pure.data.enums.Type;
import technologies.pure.executor.CommandHandler;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

//Victor

// Da implementira s pomoshtta na command pattern logika s pomoshtta na koqtao potrebitel moje da vuvejda ot konzolata:
// 1. Doklad za obshtata stoinost na wseki produkt
//  console input: products price report
//  console output:
//  Price Report:
//  1. Cola, quantity=10, price=2.17, total=21.7
//  ....
//  n. {name}, quantity={quantity}, price={price}, total={quantity*price}
// 2. Filtraciq na baza na tipa na produktite
//  console inpit: filter MEDICAL
//  console output:
//  Paracetamol
//  Aspirin
//  Nurofen
//
//  filter {type}




// Georgi
//
// Da implementira s pomoshtta na command pattern logika s pomoshtta na koqtao potrebitel moje da vuvejda ot konzolata:
// 1. Doklad za obshtata stoinost na vsichki produkti i cenata obshto
//  console input: all products price report
//  console output:
//  All Price Report:
//  quantity=51, price=1099.5
// 2. Obshta cena na vsihcki produkti na baza na tipa
//  console inpit: price MEDICAL
//  console output:
//  MEDICAL, quantity=14, price=379,10
//
//  price {type}



// Tihomir
//private String name;
//    private String description;
//    private BigDecimal price;
//    private Long quantity;
//    private Type type;
//
//
// Da implementira s pomoshtta na command pattern logika s pomoshtta na koqtao potrebitel moje da vuvejda ot konzolata:
// 1. Doklad za obshtata stoinost na vsichki produkti i cenata obshto
//  console input: all products report
//  console output:
//  All Products Report:
//  1. name=Cola, description=Drink with coffeine, price=2.17, quantity=10, type=DRINK
//  ....
//  n. name={name},description={description}, price={price} quantity={quantity}, type={type}
// 2. Izvejda vsihcki produkti koito sa na izcherpvane, t.e. vsichki s quantity po malko ot 10
//  console inpit: out of stock
//  console output:
//  1., quantity=14, price=379,10
//
//  price {type}

public class Main {
    private static List<Product> products = List.of(
            new Product("Cola", "Drink with coffeine", BigDecimal.valueOf(2.17),10l, Type.DRINK),
            new Product("Paracetamol", "Description 1", BigDecimal.valueOf(5.00),17l, Type.MEDICAL),
            new Product("Fanta", "Description 2", BigDecimal.valueOf(2.17),23l, Type.DRINK),
            new Product("Coffee", "Description 3", BigDecimal.valueOf(3.00),8l, Type.DRINK),
            new Product("Vitamin D", "Description 4", BigDecimal.valueOf(6.90),19l, Type.SUPPLEMENT),
            new Product("Vitamin for Kids", "Description 5", BigDecimal.valueOf(15.50),9l, Type.SUPPLEMENT),
            new Product("Sandwich", "Description 6", BigDecimal.valueOf(3.45),24l, Type.FOOD),
            new Product("Aspirin", "Description 7", BigDecimal.valueOf(3.10),9l, Type.MEDICAL),
            new Product("Chips", "Description 8", BigDecimal.valueOf(2.99),11l, Type.FOOD),
            new Product("Water", "Description 9", BigDecimal.valueOf(1.60),19l, Type.DRINK),
            new Product("Bread", "Description 10", BigDecimal.valueOf(1.69),3l, Type.FOOD),
            new Product("Vitamin Complex", "Description 11", BigDecimal.valueOf(11.11),3l, Type.SUPPLEMENT),
            new Product("Nurofen", "Description 12", BigDecimal.valueOf(6.07),4l, Type.MEDICAL)
    );

    public static void main(String[] args) {
	// write your code here
        CommandHandler handler = new CommandHandler();

        Scanner in = new Scanner(System.in);

        while(true) {
            String input = in.nextLine();
            handler.handle(input, products);
        }

    }
}
