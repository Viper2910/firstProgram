import java.util.Scanner;

public class displayMessage {

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static String getMessageFromUser(){
        System.out.println("Enter message to print: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        return message;
    }
}
