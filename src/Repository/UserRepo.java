package Repository;

import Entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private Map<Long, User> userMap = new HashMap<>();
    public void saveUser(User user) {
        userMap.putIfAbsent(user.getId(), user);
    }
}
