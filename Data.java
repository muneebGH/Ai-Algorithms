import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Data {
    int state;
    int rules;
    int noOfTestCases;
    Vector<String> stateDescriptions = new Vector<String>(8);
    int[][] mat;
    String[] actions;
    String[][] testCases;

    Scanner sc;

    public Data() {
        try {
            System.setIn(new FileInputStream(new File("/Users/muneeburrehman/IdeaProjects/Ai_Asi1_T1/src/input.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        sc = new Scanner(System.in);
        init();
    }

    private void init() {

        state = sc.nextInt();
        rules = sc.nextInt();
        noOfTestCases = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < state; i++) {
            stateDescriptions.add(sc.nextLine());
        }
        sc.nextLine();
        actions = new String[rules];
        for (int i = 0; i < rules; i++) {
            actions[i] = sc.nextLine();
        }


        sc.nextLine();
        mat = new int[state][rules];

        for(int i=0;i<state;i++){
            for(int j=0;j<rules;j++){
                mat[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }


        sc.nextLine();
        testCases=new String[noOfTestCases][2];

        for(int i=0;i<noOfTestCases;i++){
            String temp=sc.nextLine();
            int index=temp.indexOf(')');
            testCases[i][0]=temp.substring(0,index+1);
            temp=temp.replace(testCases[i][0]," ");
            temp=temp.trim();
            testCases[i][1]=temp;
        }

    }


}
