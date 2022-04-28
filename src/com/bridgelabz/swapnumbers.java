package com.bridgelabz;

public class swapnumbers {

        public static void main(String[] args)
        {
            float first = 1.0f , second = 2.0f;
            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);

            float temporary = first;
            first = second;
            second = temporary;

            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
}
