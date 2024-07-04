package ups;
import java.util.ArrayList;
import java.util.List;


public class User {
    private List<User> friends;

    private String name;
    private int age;
    private List<String>interests;

    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
        friends = new ArrayList<>();
    }
   
    public User(User users) {
    }

    public void add(User friends) {
        this.friends.add(friends);
    
    }

    public List<User> getFriends(){
        return friends;

    }

    @Override
    public String toString() {
        return  name;
    }

    public List<String> getInterests() {
        return interests;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    

    
    
}
