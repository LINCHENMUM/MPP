
public class Annontation {
	 public static void main(String[] args) {  
		  
	        Person per = new Student();  
	        System.out.println(per.getInfo());  
	    }  
}


class Person{  
    public String getInfo(){  
        return "����һ��Person��";  
    }  
}  
class Student extends Person{  
    @Override  
    public String getiInfo(){    // ��ʾ����  
        return "����һ��Student��";  
    }  
}  