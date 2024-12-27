package service;

import data.UserRepository;
import data.User;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public User createUser(User user)
    {

        return userRepository.save(user);
    }

    public List<User> getUser()
    {

        return userRepository.findAll();
    }
    public User getUserById(int userId)
    {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent())
        {
            return user.get();
        }
        return null;
    }

}
