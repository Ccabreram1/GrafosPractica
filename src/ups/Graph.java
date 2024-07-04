package ups;
import java.util.HashSet;
import java.util.List;


public class Graph {

    public HashSet<User> users; 

    public Graph (){
        this.users = new HashSet<>();
    }

    public User addUsers (User users){
        this.users.add(users);
        return users;
    }

    public void addConnection (User user1, User user2){
        user1.add(user2);
        user2.add(user1);

    }

    public void printGraph(){
        for(User node : users){
            System.out.print("Vertex" + node + ":");
            for (User neighbor : node.getFriends()){
                System.out.print("-->" + neighbor );
            }
            System.out.println();
        }

    }


    public List <User> getFriends (User user){
        return user.getFriends();
    }

    public List <User> recomendFriends(User user){    
        return null;
    }




    
}
