package javacase;

public class Dogg
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		
		d1.setName("Tom");
		d1.setColor("��ɫ");
		
		Dog.eat();
		
		System.out.println("���ֽУ�"+d1.getName()+",��ɫΪ��"+d1.getColor());
	}

}
