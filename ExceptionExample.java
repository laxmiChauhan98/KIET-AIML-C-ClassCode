public class ExceptionExample{
public static void main(String[] args) {
    
       System.out.println(1);
       System.out.println(2);
       System.out.println(3);
       System.out.println(4);

       try{
       System.out.println(100/0);

       System.out.println("inside Try block");
       
       System.out.println(5);
       System.out.println(6);


       }
       catch(Exception e){
        System.out.println(e);

       }

    }

}