package de.lostuxos.myapp.controller;

import de.lostuxos.myapp.service.MyService;

public class MyController {
    private MyService myService = new MyService();

    public void callService() {
        myService.doAnything();
    }
}
