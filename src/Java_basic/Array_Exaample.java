package Java_basic;

public class Array_Exaample {


        public static void main(String[] args) throws Exception{
            Learn_Int_Type_Array();
        }



        public static void Learn_Int_Type_Array(){



            // How to do Array declaration ...

            int[] num = {10,20,30,40,50,60,70,80,90};

            // 10 == 0 position , 20 = 1st position ....90 it is in 8th position ....

            // How to get length of the array ...

            int array_length = num.length;

            //System.out.println(array_length);

            for (int i = 1 ; i<array_length;i++){

                // System.out.println(i);
                System.out.println(num[i]);
            }






        }
    }

