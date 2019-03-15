package com.designpattern.behaviorpattern.command;

/**
 * @ClassName: CommandPatternTest
 * @Description: 命令模式
 * 定义：一个请求或者操作封装到一个对象中。命令模式把发送命令的责任和执行命令的责任分割开，给不同的对象
 * 优点：命令模式把请求一个操作的对象与知道怎么执行一个操作的对象分隔开，从而使新的命令类可以很容易被加入到系统当中。
 * 缺点：命令类较多时不便于管理
 * @Version: 1.0
 */
public class CommandPatternTest {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Command command = new CookCommand(chef);
        Customer customer = new Customer();
        customer.addCommand(command);
        //顾客点餐前还可以添加  服务员端茶倒水的命令等其他命令，命令之间没有绝对的顺序
        customer.orderDishes();

    }
}
