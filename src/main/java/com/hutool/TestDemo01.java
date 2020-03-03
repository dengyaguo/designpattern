package com.hutool;

import com.alibaba.fastjson.JSON;
import com.hutool.entity.User;
import java.time.LocalDateTime;
import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

/**
 * java8 stream 去重
 */
public class TestDemo01 {

    public static void main(String[] args) {

        List<User> userList = Arrays.asList(new User("anni+5", "男", 5, LocalDateTime.now().minusDays(5)),
                new User("anni+5", "男", 1, LocalDateTime.now().minusDays(5)),
                new User("anni+2", "男", 2, LocalDateTime.now().minusDays(5)),
                new User("anni+2", "男", 3, LocalDateTime.now().minusDays(5)),
                new User("anni+3", "男", 4, LocalDateTime.now().minusDays(5)),
                new User("anni+3", "男", 5, LocalDateTime.now().minusDays(5)));

        ArrayList<User> collect = userList.stream().collect(
                collectingAndThen(toCollection(() -> new TreeSet<>(
                        comparing(user -> user.getName() + user.getGender()))), ArrayList::new));

        System.out.println(JSON.toJSONString(collect));

    }


}
