import java.util.*;

class A{
   void conversion(){
    Scanner sc = new Scanner(System.in);{
        System.out.println("Enter a string : ");
        String string = sc.nextLine();
        System.out.println("Press 1 to convert to uppercase and 2 tfor lowercase : ");
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println(string.toUpperCase());
        }else if(ch==2){
            System.out.println(string.toLowerCase());
        }else{
            System.out.println("wrong choice!!!");
        }
        sc.close();
    }

   }
}

class B{
    void reverse(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter a string : ");
            String string = sc.nextLine();
            for(int i=string.length()+1;i>=0;i++){
                System.out.print(string.charAt(i));
            }
            sc.close();
        }
    }
}

class C{
    void compare(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter 1st string : ");
            String s1 = sc.nextLine();
            System.out.println("Enter 2nd string : ");
            String s2 = sc.nextLine();
            if(s1.compareTo(s2)==0){
                System.out.println("Equal");
            }else if(s1.compareTo(s2)>0){
                System.out.println(s1+"is greater");
            }else{
                System.out.println(s2+"is greater");
            }
            sc.close();
        }
    }
}

class D{
    void concat(){
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter 1st string : ");
            String s1 = sc.nextLine();
            System.out.println("Enter 2nd string : ");
            String s2 = sc.nextLine();
            String s3 = s1 + " " + s2;
            System.out.println(s3);
            sc.close();
        }
    }
}

class E{
    void search(){
        Scanner sc = new Scanner(System.in);{
            int flag = 0;            
            System.out.println("Enter a string : ");
            String s1 = sc.nextLine();
            System.out.println("Enter character to be searched : ");
            String c1 = sc.next();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==c1.charAt(0)){
                    System.out.println("Found at index : "+i);
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println("Not found!!!");
            }
            sc.close();
        }
    }
}

class F{
    void method(){
        Scanner sc = new Scanner(System.in);{
            int vowel=0;
            int consonant=0;
            int words=0;
            int space=0;
            System.out.println("Enter a string : ");
            String s1 = sc.nextLine();
            String s2 = "aeiouAEIOU";
            String s3 = " ";
            for(int i=0;i<s1.length();i++){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        vowel = vowel + 1;
                    }else{
                        consonant = consonant + 1;
                    }
                }
            }
            for(int k=0;k<s1.length();k++){
                if(s1.charAt(k)==s3.charAt(0)){
                    space = space+1;
                }
            }
            consonant = consonant - space;
            words = space+1;
            System.out.println("Vowels : "+vowel);
            System.out.println("Consonants : "+consonant);
            System.out.println("No. of words : "+words);
            sc.close();
        }
    }
}

public class pt24 {
    public static void main(String[] args) {
        int flag = 1;
        while(flag==1){
            int ch;
        System.out.println("****MENU****");
        System.out.println("1.Change the case of the string");
        System.out.println("2.Reverse the string");
        System.out.println("3.Compare two strings");
        System.out.println("4.Insert one string into another string");
        System.out.println("5.Check whether the character is present in the string and at which position");
        System.out.println("6.Check the number of word, vowel and consonant in the string");
        System.out.println("7.Exit");
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);{
            ch=sc.nextInt();
            sc.close();
        }
        switch(ch){
            case 1:
            A ob1 = new A();
            ob1.conversion();
            break;
            case 2:
            B ob2 = new B();
            ob2.reverse();
            break;
            case 3:
            C ob3 = new C();
            ob3.compare();
            break;
            case 4:
            D ob4 = new D();
            ob4.concat();
            break;
            case 5:
            E ob5 = new E();
            ob5.search();
            break;
            case 6:
            F ob6 = new F();
            ob6.method();
            break;
            case 7:
            flag = 0;
            break;
            default:
            System.out.println("Wrong choice!!!");
            break;
        }
        }
    }
}
