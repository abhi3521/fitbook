package Service;

import Entity.User;
import Repository.UserRepo;

public class UserService implements UserInterface {

    UserRepo userRepo = new UserRepo();
    @Override
    public String addUser(User user) {
        userRepo.saveUser(user);
        return "User added Successfully";
    }
}
