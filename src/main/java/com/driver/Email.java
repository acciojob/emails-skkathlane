package com.driver;

import java.sql.SQLOutput;

//import static com.sun.imageio.plugins.tiff.TIFFFaxCompressor.pass;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    if(oldPassword.equals(password)){
        if(isValid(newPassword)){
            this.password=newPassword;
            System.out.println("Password has been changed successfully");
        }
        else{
            System.out.println("password is not valid");
        }
    }
    else{
        System.out.println("password does not match");
    }


    }
    private boolean isValid(String pass){
        boolean capitalLetter = false;
        boolean smallLetter = false;
        boolean numeric = false;
        boolean special = false;
        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length();i++) {
                char check = pass.charAt(i);
                if (check >= 'A' && check <= 'Z') {
                    capitalLetter = true;
                } else if (check >= 'a' && check <= 'z') {
                    smallLetter = true;
                } else if (check >= '0' && check <= '9') {
                    numeric = true;
                } else {
                    special = true;
                }
            }

        }
        else{
            return false;
        }
        if(capitalLetter && smallLetter && numeric && special){
            return true;
        }
        return false;

    }
}
