import java.util.Arrays;
import java.util.List;

import ups.Graph;
import ups.RecommendationEngine;
import ups.User;

public class App {
    public static void main(String[] args) throws Exception {


        Graph graph = new Graph();

        // Crear usuarios
        User user1 = new User("Alice", 30, Arrays.asList("Music", "Art", "Movies"));
        User user2 = new User("Bob", 25, Arrays.asList("Music", "Sports"));
        User user3 = new User("Charlie", 35, Arrays.asList("Art", "Movies"));
        User user4 = new User("Dave", 40, Arrays.asList("Sports", "Travel"));
        User user5 = new User("Eve", 28, Arrays.asList("Music", "Movies"));

        // Añadir nodos al grafo
        graph.addUsers(user1);
        graph.addUsers(user2);
        graph.addUsers(user3);
        graph.addUsers(user4);
        graph.addUsers(user5);

        // Añadir conexiones

        graph.addConnection(user1, user2);
        graph.addConnection(user1, user2);
        graph.addConnection(user1, user3);
        graph.addConnection(user2, user4);
        graph.addConnection(user2, user3);
        graph.addConnection(user3, user5);


        graph.printGraph();
        System.out.println();

        //instanciamos clase
        RecommendationEngine engine = new RecommendationEngine();
        List<User> recommendation = engine.recomendFriends(user1, graph);
        System.out.println("Friend recommendations for " + user1.getName()
        + ": "  + recommendation);




    }

}
