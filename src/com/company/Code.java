package com.company;

/**
 * Created by el693 on 11/2/17.
 */
public class Code {

        private String myCode;
        private String temp;
        private String hiddenCode;
        public Code(String code)
        {

            myCode = code;
            for(int i = 0; i < myCode.length(); i++)
                temp += "x";
            hide(0,myCode.length()-1);

        }
        public String getCode()
        {
            return hiddenCode;
        }


        public void hide(int p1, int p2)
        {
            if(p1 >= 0 && p1 < p2 && p2 <= myCode.length()-1)
                hiddenCode = myCode.substring(0, p1 - 1) + myCode.substring(p1, p2-1) + myCode.substring(p2, myCode.length()-1);
            else if (p1 < 0)
                System.out.println("p1 must be a postive number");
            else if (p2 > myCode.length()-1)
                System.out.println("p2 must be less than the length of Your original code");
            else if (p1 > p2)
                System.out.println("p1 must be less than p2");
        }


        public void recover(int p1, int p2)
        {
            if(p1 >= 0 && p1 < p2 && p2 <= myCode.length()-1)
                hiddenCode = hiddenCode.substring(0, p1 - 1) + myCode.substring(p1, p2-1)+ myCode.substring(p2, myCode.length());
            else if (p1 < 0)
                System.out.println("p1 must be a postive number");
            else if (p2 > myCode.length()-1)
                System.out.println("p2 must be less than the length of Your original code");
            else if (p1 > p2)
                System.out.println("p1 must be less than p2");
        }
}
