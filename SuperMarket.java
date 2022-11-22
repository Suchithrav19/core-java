class SuperMarket
{
static void getVegetables(String[] vegetables)
{
	System.out.println("\n inside getVegetables()");
	System.out.println("size of vegetables is" +vegetables.length);
	for(int index=0;index<vegetables.length;index++)
	{
	System.out.println(vegetables[index]);	
}
System.out.println("end of getVegetables()");
}
	static void getPerfumes(String[] perfumes)
{
	System.out.println("\n inside getPerfumes()");
	System.out.println("size of perfumes is" +perfumes.length);
	for(int index=0;index<perfumes.length;index++)
	{
	System.out.println(perfumes[index]);	
}
System.out.println("end of getPerfumes()");
}
static void getBiscuits(String[] biscuits)
{
	System.out.println("\n inside getBiscuits()");
	System.out.println("size of Biscuits is" +biscuits.length);
	for(int index=0;index<biscuits.length;index++)
	{
	System.out.println(biscuits[index]);	
}
System.out.println("end of getBiscuits()");
}
}