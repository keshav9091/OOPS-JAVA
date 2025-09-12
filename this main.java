class Thsdemo
{
	int a, b;
	public void get(int x, int y)
	{
		this.a = a;
		this.b = b;
	}
	public void put()
	{
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	}
}
class Main
{
	public static void main(String[]args)
	{
		Thsdemo obj = new Thsdemo();
		obj.get(10,20);
		obj.put();

	}
}
