package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zean
 * Created at 2018/4/24
 * @Email zxc200706@hotmail.com
 *
 ****/

public abstract class AbstractSupportHandler implements SupportHandler {


    protected int level;

    protected AbstractSupportHandler nextHandler;

    public void setNextHandler(AbstractSupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void receiveRequest(int level, String message) {
        if (this.level <= level) {
            handleRequest(message);
        }
        if (nextHandler != null) {
            nextHandler.receiveRequest(level, message);
        }
    }

    abstract protected void handleRequest(String message);


}
