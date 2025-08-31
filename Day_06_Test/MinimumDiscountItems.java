/*
Question 3 Problem Statement : Mayuri buys N no of products from a shop.
The shop offers a different percentage of discount on each item.
She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.
[Input Format: The first input refers to the no of items;
the second input is the item name, price and discount percentage separated by comma(,)]
Assume the minimum discount offer is in the form of Integer.
Note: There can be more than one product with a minimum discount.
Sample Input 1:
4
mobile,10000,20
shoe,5000,10
watch,6000,15
laptop,35000,5
Sample Output 1:
shoe
Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900
and the discount on the laptop is 1750.
So the discount on the shoe is the minimum.
Sample Input 2:
4
Mobile,5000,10
shoe,5000,10
WATCH,5000,10
Laptop,5000,10
Sample Output 2:
Mobile
shoe
WATCH
Laptop
*/
import java.util.Scanner;

public class MinimumDiscountItems{
	public String getMinDiscountProducts(String []str){
		int minDiscount = Integer.MAX_VALUE;
		for(String s: str){
			String []data = s.split(",");

			int discount = Integer.parseInt(data[1]) * Integer.parseInt(data[2]) / 100;
			minDiscount = Math.min(discount, minDiscount);
		}

		StringBuilder sb = new StringBuilder();

		for(String s: str){
			String []data = s.split(",");
			if((Integer.parseInt(data[1]) * Integer.parseInt(data[2]) / 100) == minDiscount){
				sb.append(data[0]+"\n");
			}
		}

		return sb.toString();
	}
	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		MinimumDiscountItems obj = new MinimumDiscountItems();

		System.out.print("Enter no of products: ");
		int no = in.nextInt();
		in.nextLine();
		String [] productsDetails = new String[no];

		for(int i = 0; i < no; ++i){
			System.out.print("Enter product no. "+(i+1)+" (item_name, price, discount): ");
			String s = in.nextLine();
			productsDetails[i] = s;
		}

		String result = obj.getMinDiscountProducts(productsDetails);

		System.out.println(result);

	}
}