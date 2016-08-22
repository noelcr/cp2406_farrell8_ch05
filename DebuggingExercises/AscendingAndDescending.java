import javax.swing.*;

/**
 * Created by jc321443 on 22/08/16.
 */
public class AscendingAndDescending {
    public static void main(String []args){
        int one, two, three, four;
        String str, output;
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        one = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        two = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        three = Integer.parseInt(str);

        int[] acsendingArray = new int[2];
        int[] dArray = {0,0,0};

//        if (two > one && three > one) {
//            System.out.println(one + "is the smallest");
//            acsendingArray[0] = one;
//            dArray[2] = one;
//            System.out.println(acsendingArray[0]);
//            System.out.println(dArray[2]);
//        }

        if(one <= two && one <= three) {
            System.out.println(one + "is the smallest");
            acsendingArray[0] = one;
            dArray[2] = one;
            System.out.println(acsendingArray[0]);
            System.out.println(dArray[2]);
            if(two<=three){
                acsendingArray[1] = two;
                System.out.println(acsendingArray[1]);
                dArray[1] = two;
                System.out.println(dArray[1]);
            }
            else
            {
                acsendingArray[2] = three;
                System.out.println(acsendingArray[2]);

                dArray[1] = two;
                System.out.println(dArray[1]);
            }
        }
        else
        {
            if(two <= one && two <= three){
                acsendingArray[2] = two;

            }
        }
        System.out.println(acsendingArray[0]+ acsendingArray[1] + acsendingArray[2]);











    }

}
