package com.shsun.calLength;

public class Context {
    private Stategy stategy;
    public Context(Stategy stategy){
        this.stategy=stategy;
    }

    public void calLength() {
        this.stategy.calLength();
    }
}
