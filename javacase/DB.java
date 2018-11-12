package javacase;

public class DB
{
    String host;
    
    String username;
    
    String userpwd;
    
    String url;
    
    //构造函数
    DB(String host,String username,String userpwd,String url)
    {
    	this.host=host;
    	this.username=username;
    	this.userpwd=userpwd;
    	this.url=url;
    	
    	System.out.println("--------------------"+this.host+this.username+this.userpwd+this.url);
    }
    //构造函数 可以加访问修饰符
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
