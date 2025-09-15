import java.util.Scanner;

class StringLearnings{
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        // String name= sc.next();
        String names= sc.nextLine(); // to take more than one word
        String name2= sc.nextLine(); // to take more than one word


        System.out.println("Hello my name is "+ names);
        System.out.println( names.length());
        System.out.println( names.charAt(2));
  //charAT
  for (int i = 0; i < names.length(); i++) {
    System.out.println(names.charAt(i));
    
  }
  


  //1 s1>s2 +ve value
  //2 s1==s2 :0
  //3 s1<s2:-ve value

  if(names.compareTo(name2)==0){

    System.out.println("String are equal");

  }else{
    System.out.println("String are not equal");
  }


    }
}