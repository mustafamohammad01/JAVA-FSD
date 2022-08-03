package AccessSpecifier;
class PublicAccessSpecifier{

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}

public class public1 {
public static void main(String[] args) {
		
		PublicAccessSpecifier obj = new PublicAccessSpecifier(); 
        obj.display();  
		
	}
}
