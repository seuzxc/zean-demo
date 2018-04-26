package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/25
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class RemoteControlTest {


    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        System.err.println("----------Testing onButtonPressed on remoteControl for car ---------");
        Car car = new Car();
        CommandBase carMoveCommand = new CarMoveCommand(car);

        remoteControl.onButtonPressed(carMoveCommand);

        System.err.println("----------Testing offButtonPressed on remoteControl for car ---------");
        CommandBase carStopCommand = new CarStopCommand(car);
        remoteControl.offButtonPressed(carStopCommand);
        System.err.println("------Testing undoButtonPressed on remoteControl for car ----");
        remoteControl.undoButtonPressed();
    }
}
