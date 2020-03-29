import java.util.PriorityQueue;

public class Test {
    PriorityQueue<Node> f=new PriorityQueue<>(10,new NodeComparator());

    public Test() {
        Node n=new Node(2,null,1);
        Node s=new  Node(2,n,1);
        f.add(n);
        System.out.println(f.contains(s));
    }

    public static void main(String[] args) {
        new Test();
    }
}
