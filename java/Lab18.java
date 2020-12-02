package MyPack;
public class Lab18 {
String name;
double bal;
	public Lab18(String n, double b)  {
	name = n;
	bal = b;
	}
public void show()  {
	if (bal<0)
	System.out.println("-->");
	System.out.println(name + ": $" + bal);
}
}
