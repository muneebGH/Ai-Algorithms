package solvingBySearching.uninformedSearchStrategies.breathFirstSearch;

import java.util.Comparator;


//for future ucs
public class NodeComparator implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        if(o1.state==o2.state){
            return 0;
        }else if(o1.cost>o2.cost){
            return 1;
        }else{
            return -1;
        }
    }
}
