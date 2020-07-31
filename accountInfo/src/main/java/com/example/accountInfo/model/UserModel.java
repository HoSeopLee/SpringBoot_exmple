package com.example.accountInfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//주석이 달린 클래스의 모든 필드에 인수가 필요한 생성자 생성
@AllArgsConstructor
//주석을 사용하여 구성 목적으로 정적 팩토리 메소드를 작성
@NoArgsConstructor
@ToString
public class UserModel {
    int id;
    String userID;
    String userPassword;
    String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
