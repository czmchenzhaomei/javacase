package javacase;

public class Person
{
	//����  
	  private String name;
	   
	   //����
	  private  int age;
	   
	   
	   //������  ��Ӧ�����  ��̬����
	  static String cityName;
	  
	  
	  //����ֵ�ķ���
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  
	  //��ȡֵ�ķ���
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
			  System.out.println("���䲻�Ϸ���");
		  }
	  }
	  public int getAge()
	  {
		
		  return age;
	  }
	//   public static void main(String[] args)
	//{    
//		   //����ʵ�����������ȴ���ʵ������
//		   Person p1=new Person();
//		   
//		   p1.name="����÷";
//		   p1.age=20;
//		   
//		   //ʹ�þ�̬����   ��������.��̬������
//		   Person.cityName="������";
//		   
//		   
//		   System.out.println("����Ϊ��"+ p1.name+",����Ϊ��"+p1.age+",��ס��Ϊ"+ Person.cityName);
//		   
	//}
}
