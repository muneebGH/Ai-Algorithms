import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    PriorityQueue<Node> f=new PriorityQueue<>(10,new NodeComparator());

    public Test() {
        Scanner sc=new Scanner(System.in);
        String[] temp=sc.nextLine().split("\\s+");

        System.out.println(temp[0]);
        System.out.println(temp[1]);
    }

    public static void main(String[] args) {
        new Test();
    }
}
