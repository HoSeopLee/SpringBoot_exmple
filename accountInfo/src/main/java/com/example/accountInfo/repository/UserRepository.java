package com.example.accountInfo.repository;

import com.example.accountInfo.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    public List<UserModel> getUserList();
    public int insertUserInfo(UserModel userModel);
    public int updateUserInfo(UserModel userModel);
    public int deleteUserInfo(int id);
}
