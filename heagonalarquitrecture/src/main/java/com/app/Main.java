package com.app;

import com.app.framework.adapters.input.stdin.RouterViewCLIAdapter;

public class Main {
    public static void main(String[] args) {
        var cli = new RouterViewCLIAdapter();
        var type = "EDGE";
        System.out.println(cli.obtainRelatedRouters(type));
    }
}