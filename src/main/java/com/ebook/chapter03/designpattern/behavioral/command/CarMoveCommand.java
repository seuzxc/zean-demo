package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zean
 * Created at 2018/4/25
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CarMoveCommand implements CommandBase {

    private Car car;

    public CarMoveCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        System.err.println("CarMoveCommand.execute(): invoking move() on Car");
        car.move();
    }

    @Override
    public void undo() {
        System.err.println("CarMoveCommand.undo(): Undoing previous action->Invoking stop() on Car");
        car.stop();
    }
}
