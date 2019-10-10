package com.shsun.calLength.dateType;

import com.shsun.calLength.schedulingWay.StategySchedulingWay;

public class ContextDateType {
    private StategySchedulingWay stategy;
    public ContextDateType(StategySchedulingWay stategy){
        this.stategy=stategy;
    }

    public void schedulingWay() {
        this.stategy.calLength();
    }
}
