package com.shsun.calLength.unit;

public class ContextUnit {
    private StategyUnit stategy;
    public ContextUnit(StategyUnit stategy){
        this.stategy=stategy;
    }

    public void schedulingWay() {
        this.stategy.calLength();
    }
}
