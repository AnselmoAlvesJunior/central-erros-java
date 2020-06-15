package com.codenation.enums;

public enum LogErrorEnum {
    ERROR("error"),
    WARNING("warning"),
    INFO("info");

    private String type;

    LogErrorEnum(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
