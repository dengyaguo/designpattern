package com.hutool.action;

import com.hutool.entity.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class CollectionTestDemo {

    public static void main(String[] args) throws InterruptedException {

        User user3 = new User("anni+3",3, LocalDateTime.now().minusDays(3));
        User user5 = new User("anni+5",5, LocalDateTime.now().minusDays(5));
        User user1 = new User("anni+1",1, LocalDateTime.now().minusDays(1));
        User user4 = new User("anni+4",4, LocalDateTime.now().minusDays(4));
        User user2 = new User("anni+2",2, LocalDateTime.now().minusDays(2));

        List<User> userList = new ArrayList<>();
        userList.add(user3);
        userList.add(user5);
        userList.add(user1);
        userList.add(user4);
        userList.add(user2);
        userList.forEach(System.out::println);
        userList.sort(Comparator.comparing(User::getCreateTime).reversed());
        userList.forEach(System.out::println);
    }
}
