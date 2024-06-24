//Demonstration of switch-case statement

public class Vowel {
    public static void main(String[] args) {
    
        String s1;
        s1=args[0];

        switch(s1)
        {
            case "a": System.out.println(s1 +" is a vowel");
                        break;

            case "e":System.out.println(s1 + " is a vowel");
                        break;

            case "i":System.out.println(s1 + " is a vowel ");
                        break;

            case "o":System.out.println(s1 + " is a vowel");
                        break;

            case "u":System.out.println(s1+ " is a vowel");
                        break;

            default : System.out.println(s1+ " is not a vowel");
        }
    }
}
