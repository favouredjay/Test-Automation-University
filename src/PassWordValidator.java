//Validate the complexity of a proposed password by assuring it meets these needs:
//atleast 8 character long
//contains an uppercase letter
//contains a special character
//not contain the username
//not the same as the old password


import java.util.Scanner;

public class PassWordValidator {
    String Password;
    public void passwordChecker(String userName, String password){
        if(password.length() < 8){
            if(password.equals(password.toLowerCase())){
                if(password.matches("[a-zA-Z0-9 ]*")){
                    if(password.equals(userName)){
                        if(password.equals(this.Password)){
                            throw new IllegalArgumentException("Password is wrong");
                        }
                    }
                }

            }
            throw new IllegalArgumentException("Password is wrong");
        }

    }

    public static void main(String[] args) {
        PassWordValidator validator = new PassWordValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = input.next();

        System.out.println("Enter Password");
        String password = input.next();
       validator.passwordChecker(userName,password);
    }


}
