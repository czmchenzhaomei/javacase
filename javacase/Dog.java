package javaone;

public class Dog
{
	//ʵ������ ÿ��������ɫ��һ��
    private String color;
    
    private String name;
    
    //���ǹ��Ĺ��� ����������̬����
    public static void eat()
    {
    	System.out.println("��ϲ����ɶ��");
    }
    
    //
    public void setColor(String color) 
    {
    	this.color=color;
    }
    
    public String getColor()
    {
    	return this.color;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public String getName() 
    {
    	return this.name;
    }
    
    
}
