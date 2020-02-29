package edu;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Service
public class UserServiceImpl implements UserService{

    private String name;

    public String getUserName() {
        System.out.println("name is " + name);
        return name;
    }
}
