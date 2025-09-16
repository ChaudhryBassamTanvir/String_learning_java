import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Tony"); 
     
     System.out.println(sb);
//chartAt()
System.out.println(sb.charAt(2));

//set char
// sb.setCharAt(0, "p");



sb.insert(0, "s");
System.out.println(sb);


    }
}
