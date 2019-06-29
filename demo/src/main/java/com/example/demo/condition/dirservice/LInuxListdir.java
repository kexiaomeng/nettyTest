package com.example.demo.condition.dirservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LInuxListdir implements IListService{
    @Override
    public void printdir() {
        log.error("ls");
    }
}
