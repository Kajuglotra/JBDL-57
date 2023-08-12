package org.exceptionHandling;

public class ExceptionDemo {

    public void test(int c) {
        try {

            System.exit(1);
            int a = 10;
            int d = c;
            int b = a / d;
            System.out.println(b);

        } catch (ArithmeticException e) {
            try{
                String str = "abc";
                System.out.println(Integer.parseInt(str));
            }catch (NumberFormatException numberFormatException){
                numberFormatException.printStackTrace();
            }
            e.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }  finally {
            System.out.println("inside finally method");
        }


    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.test(0);
        System.out.println("here");
    }

}
// try -> chunk of code on which i want to see if any exception is coming
