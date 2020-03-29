import java.util.Collection;
import java.util.Vector;

public class Data {
    int state = 8;
    int rules = 3;
    int noOfTestCases = 2;
    Vector<String> stateDescriptions = new Vector<String>(8);
    int[][] mat = {
            {2, 0, 4},
            {3, 1, 5},
            {2, 2, 6},
            {3, 3, 7},
            {5, 0, 4},
            {5, 1, 5},
            {7, 2, 6},
            {7, 3, 7}
    };
    String[][] testCases=

    {
        {"(AgentInRoom1, Room1Clean, Roam2Dusty)", "(AgentInRoom1, Room1Clean, Roam2Clean)"},
        {"(AgentInRoom1, Room1Dusty, Roam2Dusty)", "(AgentInRoom2, Room1Clean, Roam2Clean)"}

    };

    public Data() {
        init();
    }

    private void init() {
        stateDescriptions.add("(AgentInRoom1, Room1Dusty, Roam2Dusty)");
        stateDescriptions.add("(AgentInRoom1, Room1Dusty, Roam2Clean)");
        stateDescriptions.add("(AgentInRoom1, Room1Clean, Roam2Dusty)");
        stateDescriptions.add("(AgentInRoom1, Room1Clean, Roam2Clean)");
        stateDescriptions.add("(AgentInRoom2, Room1Dusty, Roam2Dusty)");
        stateDescriptions.add("(AgentInRoom2, Room1Dusty, Roam2Clean)");
        stateDescriptions.add("(AgentInRoom2, Room1Clean, Roam2Dusty)");
        stateDescriptions.add("(AgentInRoom2, Room1Clean, Roam2Clean)");


    }
}
