package javacase;

public class Staticobject
{
	//����ʵ��������
		String name;
		
		byte age;
		//��̬ȫ�ֱ���
	   static  String schoolName;
	   
	   
	   
	   public static void main(String[] args)
	{   
		//��̬��������ֱ��ʹ�þ�̬����
	    schoolName="�Ͼ��Ƽ�ְҵѧԺ";
	    
	    //����������ʵ���������ȴ���ʵ������    new������һ�����ڴ�
	    Staticobject stu1=new Staticobject();
	    
	     //������ֵ
	    stu1.name="����÷";
	    stu1.age=100;
	    
	    System.out.println("ѧ��������"+stu1.name);
	    System.out.println("ѧ�����䣺"+stu1.age);
	    System.out.println("ѧ��ѧУ��"+Staticobject.schoolName);
	    
	    
	    Staticobject stu2=new Staticobject();
	    stu2.name="Ԭ����";
	    stu2.age=99;
	    
	    System.out.println("ѧ��������"+stu2.name);
	    System.out.println("ѧ�����䣺"+stu2.age);
	    
	    //��̬������Ҫ�ٴθ�ֵ����Ϊ���ǹ��е�
	    System.out.println("ѧ��ѧУ��"+Staticobject.schoolName);
	    
	}
		
}
