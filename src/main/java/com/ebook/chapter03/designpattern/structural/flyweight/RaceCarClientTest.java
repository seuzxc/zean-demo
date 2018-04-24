package com.ebook.chapter03.designpattern.structural.flyweight;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/20
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class RaceCarClientTest {

    public static void main(String[] args) {

        /***
         * 享元模式将对象的公共不变部分固定到对象中，将变换的部分抽取出来通过client传递。
         * 并且对于固定属性的的对象，使用工厂方法创建对象并缓存起来
         * 目标：减少不必要的对象实例，节省内存资源
         */
        RaceCarClient raceCars[] = {
            new RaceCarClient("Midget"),
            new RaceCarClient("Midget"),
            new RaceCarClient("Midget"),
            new RaceCarClient("Sprint"),
            new RaceCarClient("Sprint"),
            new RaceCarClient("Sprint")
        };

        raceCars[0].moveCar(29,3112);
        raceCars[1].moveCar(39,2002);
        raceCars[2].moveCar(49,1985);
        raceCars[3].moveCar(59,2543);
        raceCars[4].moveCar(69,2322);
        raceCars[5].moveCar(79,2135);

        System.err.println("Midget car instances: "+FlyweightMidgetCar.num);
        System.err.println("Sprint car instances: "+FlyweightSprintCar.num);
    }
}
