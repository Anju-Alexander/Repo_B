package org.example;

public class Main {

    static thirdParty obj=new thirdParty();
    public static void main(String[] args) {

        try{
            System.out.println("Hello world!");
            obj.disp();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
    }
}
