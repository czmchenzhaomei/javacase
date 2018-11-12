package javacase;

public class Dogg
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		
		d1.setName("Tom");
		d1.setColor("黄色");
		
		Dog.eat();
		
		System.out.println("名字叫："+d1.getName()+",颜色为："+d1.getColor());
	}

}
