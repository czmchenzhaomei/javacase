package javacase;

public class Person
{
	//姓名  
	  private String name;
	   
	   //年龄
	  private  int age;
	   
	   
	   //城市名  对应多个人  静态变量
	  static String cityName;
	  
	  
	  //设置值的方法
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  
	  //获取值的方法
	  public String getName() 
	  {
		  return name;
	  }
	  
	  public void setAge(int age)
	  {
		  if(age>0 && age<400) 
		  {
			  this.age=age;
		  }else 
		  {
			  System.out.println("年龄不合法！");
		  }
	  }
	  public int getAge()
	  {
		
		  return age;
	  }
	//   public static void main(String[] args)
	//{    
//		   //访问实例变量，首先创建实例对象
//		   Person p1=new Person();
//		   
//		   p1.name="陈赵梅";
//		   p1.age=20;
//		   
//		   //使用静态变量   采用类名.静态变量名
//		   Person.cityName="淮安市";
//		   
//		   
//		   System.out.println("姓名为："+ p1.name+",年龄为："+p1.age+",居住地为"+ Person.cityName);
//		   
	//}
}
