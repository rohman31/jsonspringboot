package com.infosys.demo.springboot;

public class EmployeeRespond {

    private static final long serialVersionUID = -3495030043333883005L;
    private Integer code;
    private String key=null;

    public EmployeeRespond(Integer code, String key) {
        this.code = code;
        this.key = key;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}
