import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int vowelCount = 0, consonantCount = 0;
        String userInput = null;

        System.out.print("Enter a string: ");
        userInput = scan.next();

        char[] inputString = userInput.toCharArray();

        for(int i = inputString.length-1; i >= 0; i--){
            System.out.print(inputString[i]);
        }

        System.out.println();

        userInput = userInput.toLowerCase();
        char[] inputStringLowerCase = userInput.toCharArray();

        for(int i = 0; i < inputStringLowerCase.length; i++){


            if(inputStringLowerCase[i] == 'a' || inputStringLowerCase[i] == 'e' || inputStringLowerCase[i] == 'i' || inputStringLowerCase[i] == 'o' || inputStringLowerCase[i] == 'u' ){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
