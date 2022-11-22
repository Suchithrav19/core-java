class Swiggys
{
public static double takeOrder(String items)
{
 if(items=="pizza")
 {
 System.out.println("The order is "+items);
 return 99.0;
 }
 if(items=="burger")
 {
 System.out.println("The order is "+items);
 return 60.0;
 }
 if(items=="sandwitch")
 {
	System.out.println("The order is "+items);
 return 70.0;
 }
 return 0.0;
}
}
public static double takeOrder(String items,int quantity)
{
 if(items=="pizza")
 {
 System.out.println("The order is "+items);
 return 99.0*quantity;
 }
 if(items=="burger")
 {
 System.out.println("The order is "+items);
 return 60.0*quantity;
 }
 if(items=="sandwitch")
 {
	System.out.println("The order is "+items);
 return 70.0*quantity;
 }
 return 0.0;
}
}


 