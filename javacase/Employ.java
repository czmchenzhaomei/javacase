package javacase;

public class Employ
{
	//员工姓名
		 String name;
		 
		 //员工工资
		 double salary;
		 
		 //实现某种功能的方法
	     void  show() 
	     {
	    	 
	    	double money=1000;
	    	
	    	//局部变量和全局变量不能直接相加，使用局部变量要先赋值
	    	salary=salary+money;
	    	
	    	System.out.println("加薪后的工资为："+salary);
	    	 
	     }	 

		
	     public static void main(String[] args)
		{
	    	 //实例化对象
	    	 Employ emp1=new Employ(); 
	    	 
	    	 
	    	 emp1.name="陈赵梅";
	    	 emp1.salary=9.9;
	    	
	    	 System.out.println(emp1.name+"的工资为："+emp1.salary);
	    	 
	    	 //调用这个方法
	    	 emp1.show();
	    	 
		}
}
