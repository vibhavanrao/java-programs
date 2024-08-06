package com.vibhavan.exception_handling;

public class ThrowsExceptionHandling {
    public static void main(String[] args) {
        String username = "vibhavan";
        String password = "Pvr@198135";
        boolean isvalid;
        try {
            isvalid = isvalid(username, password);
            if (isvalid) {
                System.out.println("user access is accepted");
            }
        }catch(NullPointerException e){
            System.out.println("details cannot be null");
        }catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }

    }

    static boolean isvalid(String username, String password) throws NullPointerException, InvalidUserException {
        boolean isvalid = false;
        if (username.equalsIgnoreCase("VIBHAVAN") && password.equals("Pvr@198135")){
            isvalid = true;
        }
        else{
            throw new InvalidUserException("invalid username or password");
        }
        return isvalid;
    }
}
