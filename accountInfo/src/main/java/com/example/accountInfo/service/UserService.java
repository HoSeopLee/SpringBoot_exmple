package com.example.accountInfo.service;

import com.example.accountInfo.model.UserModel;
import com.example.accountInfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getUserList(){
        return userRepository.getUserList();
    }
    public int insertUserInfo(UserModel userModel){
        return userRepository.insertUserInfo(userModel);
    }
    public int updateUserInfo(UserModel userModel){
        return  userRepository.updateUserInfo(userModel);
    }
    public int deleteUserInfo(int id){
        return userRepository.deleteUserInfo(id);
    }
}
