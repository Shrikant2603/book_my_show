package com.neebal.bookmyshow.services;

import com.neebal.bookmyshow.entities.*;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MasterDataService {

    private List<User> users;

    MasterDataService(){

        this.users = Arrays.asList(
                new User("abc","123","India",'M'),
                new User("xyz","456","Japan",'F')
        );
    }

    public User authenticate(String username, String password){
        List<User> users =this.users
                .stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                .collect(Collectors.toList());

        if(users.size()>0){
            return users.get(0);
        }
        else{
            return null;
        }
    }

}
