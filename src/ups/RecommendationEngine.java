package ups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class RecommendationEngine {

    public List<User>recomendFriends(User user, Graph graph){
        List<User> recomendations = new ArrayList<>();
        for (User potentialFriendUser : graph.users){
            User potentialUser = potentialFriendUser;
            if (!user.getFriends().contains(potentialUser)&& !user.equals(potentialFriendUser)) { 
                double similarity = calculateSimilarity(user, potentialFriendUser);
                //si la simulitud es mayor a cierto umbral, va agg al arreglo inicial el potencial amigo
                if (similarity > 0.5) { //umbral para recomendacion 
                    recomendations.add(potentialFriendUser);
                }
            }
        }
    return recomendations;
    }

    public double calculateSimilarity(User user1, User user2){
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection= new HashSet<>(interests1);

        //en vez de for se utiliza retainAll(solo se interesaran los que esten iguales)
        intersection.retainAll(interests2);
        //set de union de intereses
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor --" + resp);

        return resp;
    }
    

    
}
