package com.poppy.ioc._3_componentScan;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
@Lazy
@Repository
public class OrderDao {
    public String getName(){
        return "小王";
    }
}
