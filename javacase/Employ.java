package javacase;

public class Employ
{
	//Ա������
		 String name;
		 
		 //Ա������
		 double salary;
		 
		 //ʵ��ĳ�ֹ��ܵķ���
	     void  show() 
	     {
	    	 
	    	double money=1000;
	    	
	    	//�ֲ�������ȫ�ֱ�������ֱ����ӣ�ʹ�þֲ�����Ҫ�ȸ�ֵ
	    	salary=salary+money;
	    	
	    	System.out.println("��н��Ĺ���Ϊ��"+salary);
	    	 
	     }	 

		
	     public static void main(String[] args)
		{
	    	 //ʵ��������
	    	 Employ emp1=new Employ(); 
	    	 
	    	 
	    	 emp1.name="����÷";
	    	 emp1.salary=9.9;
	    	
	    	 System.out.println(emp1.name+"�Ĺ���Ϊ��"+emp1.salary);
	    	 
	    	 //�����������
	    	 emp1.show();
	    	 
		}
}
