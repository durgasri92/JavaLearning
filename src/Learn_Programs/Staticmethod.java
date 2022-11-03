package Learn_Programs;

public class Staticmethod {

        int RollNo;
        String Name;
        static String collegeName= "CBT";
       // static void Change()
      //  { collegeName="CBIT";

       // }
    Staticmethod(int r,String s)
    { RollNo=r;
        Name=s;

    }
            void display()
            {System.out.println(RollNo+" "+Name+" "+collegeName);

            }
    public static void main (String[]args)
    {

        //Staticmethod.Change();
        Staticmethod s1=new Staticmethod(101,"Moukthika");
        Staticmethod s2=new Staticmethod(102,"shashank");
        Staticmethod s3=new Staticmethod(103,"krishna");
         s1.display();
         s2.display();
         s3.display();

            }

        }

