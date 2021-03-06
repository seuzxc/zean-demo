package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zean
 * Created at 2018/4/25
 * @Email zxc200706@hotmail.com
 *
 ****/

public class TopRotateCommand implements CommandBase {

    private RotatingTop rotatingTop;

    public TopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.err.println("TopRotateCommand.execute(): Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }

    @Override
    public void undo() {
        System.err.println("TopRotateCommand.undo(): Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }
}
