package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/25
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class TopStopRotateCommand implements CommandBase {

    private RotatingTop rotatingTop;

    public TopStopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.err.println("TopStopRotateCommand.execute(): Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }

    @Override
    public void undo() {
        System.err.println("TopStopRotateCommand.undo(): Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }
}
