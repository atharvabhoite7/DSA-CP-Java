

public class arraydemo{

    public static void main (String args[])
    {
        int [] intArray = new int [4];

        intArray[0]= 1;
        intArray[2]= 2;
        intArray[1]= 3;
        intArray[3]= 4;

        int index = -1;
        for (int i=0; i<intArray.length; i++)
        {
            if (intArray[i] == 4){;
            index = i;
            break;}
        }
        System.out.println("index= "+ index);




    }
}