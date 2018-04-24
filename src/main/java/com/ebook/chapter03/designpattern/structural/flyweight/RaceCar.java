package com.ebook.chapter03.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/19
 * @Email zengxiangcai@yishufu.com
 *
 ****/

@Getter
@Setter
public abstract class RaceCar {
    /*** intrinsic data stored and shared in the flyweight object */
    private String name;
    private int speed;
    private int horsePower;
    //extrinsic data stored or computed by client object, and passed to flyweight object
    abstract void moveCar(int currentX, int currentY, int nextX, int nextY);
}
