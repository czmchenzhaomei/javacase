package javaone;

public class Dog
{
	//实例变量 每个狗的颜色不一样
    private String color;
    
    private String name;
    
    //这是狗的共性 所以声明静态方法
    public static void eat()
    {
    	System.out.println("狗喜欢吃啥！");
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
