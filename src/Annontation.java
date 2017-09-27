
public class Annontation {
	 public static void main(String[] args) {  
		  
	        Person per = new Student();  
	        System.out.println(per.getInfo());  
	    }  
}


class Person{  
    public String getInfo(){  
        return "这是一个Person类";  
    }  
}  
class Student extends Person{  
    @Override  
    public String getiInfo(){    // 提示错误  
        return "这是一个Student类";  
    }  
}  