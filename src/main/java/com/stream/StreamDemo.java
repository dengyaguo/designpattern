package com.stream;

import com.alibaba.fastjson.JSON;
import com.entity.User;
import com.exception.BuinessException;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {



        User user3 = new User("anni+3",3, LocalDateTime.now().minusDays(3));
        User user5 = new User("anni+3",5, LocalDateTime.now().minusDays(5));
        User user1 = new User("anni+1",1, LocalDateTime.now().minusDays(1));
        User user4 = new User("anni+4",4, LocalDateTime.now().minusDays(4));
        User user2 = new User("anni+2",2, LocalDateTime.now().minusDays(2));
        List<User> userList = Arrays.asList(user3, user1, user2, user4, user5);

        try {
            Optional.ofNullable(userList).ifPresent(users -> {
                    throw new RuntimeException();
            });
        } catch (Exception e) {
            throw new BuinessException(110,"msg");
        }
//        List<User> collect4 = userList.stream().filter(user -> user.getAge().equals(6)).collect(Collectors.toList());
//        Optional.ofNullable(collect4).ifPresent(users -> System.out.println(JSON.toJSONString(collect4)));
//
//        //排序
//        userList.sort(Comparator.comparing(User::getCreateTime).reversed());
//
//        //转map
//        //Map<String, User> collect = userList.stream().collect(Collectors.toMap(User::getName, Function.identity()));  key 重复会报错
//        LinkedHashMap<String, User> collect1 = userList.stream().collect(Collectors.toMap(User::getName, Function.identity(), (o, o2) -> o2, LinkedHashMap::new));
//
//        //根据字段去重
//        ArrayList<User> collect2 = userList.stream().collect(
//                Collectors.collectingAndThen(  Collectors.toCollection(() -> new TreeSet<>(
//                        Comparator.comparing(user -> user.getName() + user.getGender()))), ArrayList::new));
//
//        //求和
//        Map<String, Integer> collect3 = userList.stream()
//                .filter(user -> "男".equals(user.getGender()))
//                .collect(  Collectors.groupingBy(User::getGender,  Collectors.reducing(0, User::getAge, Integer::sum)));
//
//       //分组后去重
////        Map<String, Set<String>> namesByCity
////                = userList.stream().collect(  Collectors.groupingBy(User::getGender,
////                Collectors.mapping(User::getName,   Collectors.toSet())));
////      //分组取最大
////        Comparator<User> userComparator = Comparator.comparingInt(User::getAge);
////        Map<String, Optional<User>> collect = userList.stream().collect(Collectors.groupingBy(User::getName, Collectors.reducing(BinaryOperator.maxBy(userComparator))));
////        JSON.toJSONString(collect);
//
        ArrayList<User> objects = new ArrayList<>();
        Map<String, User> fff = objects.stream().collect
                (Collectors.toMap(User::getName, omsWaybillDetailVO -> omsWaybillDetailVO));
        User user = fff.get("");

    }
}
