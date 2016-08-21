import jdk.nashorn.internal.parser.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import javax.print.attribute.IntegerSyntax;
import javax.swing.*;

/**
 * Created by jc321443 on 22/08/16.
 */
public class EvenOdd {
    public static void main(String []args){
        String input;
        int userNum;
        input = JOptionPane.showInputDialog(null,"Enter an integer");
        userNum = Integer.parseInt(input);

        int evenTest;
        evenTest = userNum%2;

        if (evenTest == 1)
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");


    }
}
