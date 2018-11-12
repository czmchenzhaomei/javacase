package javacase;

public class Staticobject
{
	//声明实例化变量
		String name;
		
		byte age;
		//静态全局变量
	   static  String schoolName;
	   
	   
	   
	   public static void main(String[] args)
	{   
		//静态方法可以直接使用静态变量
	    schoolName="南京科技职业学院";
	    
	    //访问这个类的实例变量，先创建实例对象    new就生成一个堆内存
	    Staticobject stu1=new Staticobject();
	    
	     //给对象赋值
	    stu1.name="陈赵梅";
	    stu1.age=100;
	    
	    System.out.println("学生姓名："+stu1.name);
	    System.out.println("学生年龄："+stu1.age);
	    System.out.println("学生学校："+Staticobject.schoolName);
	    
	    
	    Staticobject stu2=new Staticobject();
	    stu2.name="袁信莉";
	    stu2.age=99;
	    
	    System.out.println("学生姓名："+stu2.name);
	    System.out.println("学生年龄："+stu2.age);
	    
	    //静态对象不需要再次赋值，因为它是公有的
	    System.out.println("学生学校："+Staticobject.schoolName);
	    
	}
		
}
