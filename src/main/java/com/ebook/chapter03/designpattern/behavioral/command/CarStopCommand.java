package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zean
 * Created at 2018/4/25
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CarStopCommand implements CommandBase {

    private Car car;

    public CarStopCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.err.println("CarStopCommand.execute(): invoking stop() on Car");
        car.stop();
    }

    @Override
    public void undo() {
        System.err.println("CarStopCommand.undo(): Undoing previous action-> Invoking move() on Car");
        car.move();
    }
}
