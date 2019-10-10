package com.shsun;

import com.shsun.calLength.CalLengthLeave;
import com.shsun.calLength.Context;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new CalLengthLeave());
        context.calLength();
    }
}
