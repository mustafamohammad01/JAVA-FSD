package AccessSpecifier;
class ProtectedAccessSpecifier
{ 
   protected void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
}
public class Protected extends ProtectedAccessSpecifier{
		public static void main(String[] args) {
			Protected obj = new Protected ();   
		       obj.display();  
		}

}
