package com.example.bt9_recycleview_ngangdoc;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String userName;
    public UserModel(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
