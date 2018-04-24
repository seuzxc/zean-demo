package com.ebook.chapter03.designpattern.structural.facade;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/19
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class InventoryService {
    public boolean isProductAvailable(int productId){
        //check the product inventory is available
        return true;
    }
}
