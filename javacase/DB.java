package javacase;

public class DB
{
    String host;
    
    String username;
    
    String userpwd;
    
    String url;
    
    //���캯��
    DB(String host,String username,String userpwd,String url)
    {
    	this.host=host;
    	this.username=username;
    	this.userpwd=userpwd;
    	this.url=url;
    	
    	System.out.println("--------------------"+this.host+this.username+this.userpwd+this.url);
    }
    //���캯�� ���Լӷ������η�
    public DB()
    {
    	System.out.println("*************************");
    }
    
    public static void main(String[] args)
	{
    	DB dd = new DB("127.0.0.1","student","student","jbdc");
    	
    	DB ddd = new DB();
	}
}
