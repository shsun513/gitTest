package com.shsun.calLength.schedulingWay;

public class ContextSchedulingWay {
    private StategySchedulingWay stategy;
    public ContextSchedulingWay(StategySchedulingWay stategy){
        this.stategy=stategy;
    }

    public void schedulingWay() {
        this.stategy.calLength();
    }
}
