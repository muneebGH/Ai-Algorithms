package solvingBySearching.uninformedSearchStrategies.breathFirstSearch;

public class Node {
    int state;
    int cost;
    Node parent;

    public Node(int state, Node parent) {
        this.state = state;
        this.parent = parent;
    }

    @Override
    public boolean equals(Object obj) {
        Node to=(Node)obj;
        if(to.state==((Node) obj).state){
            return true;
        }
        return false;
    }
}
