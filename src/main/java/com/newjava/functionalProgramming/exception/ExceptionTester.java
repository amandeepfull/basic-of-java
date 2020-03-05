package com.newjava.functionalProgramming.exception;


/// one class which will be having method for exception arguement of type a interface,
// for us we created CodeBlock as interface.

public class ExceptionTester {

    public static String exception(CodeBlock block, Exception e){


        try{
            block.run();

        }catch (Exception e1){

            System.out.println(e.getClass());
            if(e.getClass().equals(e1.getClass())){

                return "Matched";
            }
            else
                return "Not Matched";
        }
        return "Not Matched";
    }
}

