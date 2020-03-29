import java.util.*;

public class Algorithm {
    private int states;
    private int noOfTestCases;
    private Vector<String> stateDescriptions;
    private int[][] transitionMatrix;
    private String[][] testCases;
    int noOfActions;
    String[] actions;


    private ArrayDeque<Node> frontier = new ArrayDeque<>();
    Set<Integer> exploredSet = new HashSet<>();


    public Algorithm( int states, int noOfTestCases, Vector<String> stateDescriptions, int[][] transitionMatrix, String[][] testCases,int noOfActions,String[] actions) {

        this.states = states;
        this.noOfTestCases = noOfTestCases;
        this.stateDescriptions = stateDescriptions;
        this.transitionMatrix = transitionMatrix;
        this.testCases = testCases;
        this.noOfActions=noOfActions;
        this.actions=actions;


    }


    public ArrayList<String> solve() {
        ArrayList<String> solutions = new ArrayList<>(noOfTestCases);


        for (int i = 0; i < noOfTestCases; i++) {
            solutions.add(breathFirstSearch(stateDescriptions.indexOf(testCases[i][0]), stateDescriptions.indexOf(testCases[i][1])));
            frontier = new ArrayDeque<>();
            exploredSet = new HashSet<>();
        }


        return solutions;
    }


    private String breathFirstSearch(int startState, int goalState) {
        String toReturn=null;
        Node start = new Node(startState, null);
        frontier.addFirst(start);
        while(true){
            if (frontier.isEmpty()){
                break;
            }
            Node n=frontier.removeFirst();

            if(n.state==goalState){
                toReturn= getSolutionFromNode(n);
                break;
            }

            exploredSet.add(n.state);
            int[] actionList=transitionMatrix[n.state];
            for(int i=0;i<noOfActions;i++){
                Node child=new Node(actionList[i],n);
                if(!frontier.contains(child) || !exploredSet.contains(child.state)){
                    frontier.add(child);
                }
            }

        }

        return toReturn;
    }



    private String getSolutionFromNode(Node n){
        Stack<Integer> temp=new Stack<>();
        temp.push(n.state);
        while(n.parent!=null){
            n=n.parent;
            temp.push(n.state);
        }

        Vector<Integer> v=new Vector<>();
        int[] localActionList=new int[noOfActions];
        for (int i=0;i<noOfActions;i++){
            localActionList[i]=-1;
        }
        int until=temp.size();

        for(int i=0;i<until;i++){

            int toCompare=temp.pop();
            for(int j=0;j<noOfActions;j++){
                if(localActionList[j]==toCompare){
                    v.add(j);
                    localActionList=transitionMatrix[toCompare];
                    break;
                }
                if(j==(noOfActions-1)){
                    localActionList=transitionMatrix[toCompare];
                }
            }
        }

        String toReturn="";
        for(int i=0;i<v.size();i++){
            toReturn=toReturn+" -> "+actions[v.elementAt(i)];
        }

        return toReturn;

    }
}
