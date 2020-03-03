package com.hutool;

import com.alibaba.fastjson.JSON;
import com.hutool.entity.User;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

/**
 * java8 stream 分组
 */
public class TestDemo02 {

    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("anni+3", "男", 3, LocalDateTime.now().minusDays(3)),
                new User("anni+5", "男", 5, LocalDateTime.now().minusDays(5)),
                new User("anni+5", "男", 5, LocalDateTime.now().minusDays(5)),
                new User("anni+4", "男", 4, LocalDateTime.now().minusDays(4)),
                new User("anni+2", "非男", 2, LocalDateTime.now().minusDays(2)));

        Map<String, Integer> collect = userList.stream()
                //.filter(user -> "男".equals(user.getGender()))
                .collect(groupingBy(User::getGender,reducing(0, User::getAge, Integer::sum)));
        System.err.println(JSON.toJSONString(collect));

        Map<String, Set<String>> namesByCity
                = userList.stream().collect(groupingBy(User::getGender,
                mapping(User::getName, toSet())));

        System.err.println(JSON.toJSONString(namesByCity));
    }
}
