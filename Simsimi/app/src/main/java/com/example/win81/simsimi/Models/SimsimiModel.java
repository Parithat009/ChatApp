package com.example.win81.simsimi.Models;

/**
 * Created by Win8.1 on 11/12/2560.
 */

public class SimsimiModel {

    public String responce;
    public String id;
    public int result;
    public String msg;

    public SimsimiModel(String responce, String id, int result, String msg) {
        this.responce = responce;
        this.id = id;
        this.result = result;
        this.msg = msg;
    }

    public SimsimiModel() {
    }

    public String getResponce() {
        return responce;
    }

    public void setResponce(String responce) {
        this.responce = responce;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
