import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        List<Agent> agents = names.stream().map(new Function<String, Agent>() {
            @Override
            public Agent apply(String name) {
                String[] cutName = name.split(" ");
                String fName = cutName[0];
                String lName = cutName[1];
                Agent agent = new Agent(fName, lName);
                return agent;
            }
        }).collect(Collectors.toList());
        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}