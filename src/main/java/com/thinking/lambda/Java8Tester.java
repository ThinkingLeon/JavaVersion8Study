package com.thinking.lambda;

/**
 * @author: ThinkingLee
 * @date: 2020/11/16
 * @desc: lambda测试类
 */
public class Java8Tester {

    public static void main(String[] args) {

        //类型声明
        MathOperation add = (int x, int y) -> x + y;
        //不带类型声明
        MathOperation sub = (x, y) -> x - y;
        //大括号中的返回语句
        MathOperation mul = (x, y) -> {
            return x * y;
        };
        //没有大括号及返回语句
        MathOperation div = (int x, int y) -> x / y;

        System.out.println("10 + 5 = "+ operate(10,5,add));
        System.out.println("10 - 5 = "+ operate(10,5,sub));
        System.out.println("10 * 5 = "+ operate(10,5,mul));
        System.out.println("10 / 5 = "+ operate(10,5,div));

        //不用括号
        GreetingService greetingService1 = (message) -> System.out.println(message);
        //用括号
        GreetingService greetingService2 = msg -> System.out.println(msg);
        //方法引用
        GreetingService greetingService3 = System.out::println;

        greetingService1.sayMsg("hello world1");
        greetingService2.sayMsg("hello world2");
        greetingService3.sayMsg("hello world3");

    }

    private static int operate(int x, int y, MathOperation operation){
        return operation.operate(x,y);
    }

    interface GreetingService{
        void sayMsg(String msg);
    }
}
