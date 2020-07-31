package com.example.accountInfo.controller;


import com.example.accountInfo.model.UserModel;
import com.example.accountInfo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@EnableAutoConfiguration
@AllArgsConstructor
@RequestMapping("/api/v1/user")
@Api(value = "유정 정보", description = "User CRUD")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "UserList", notes = "")
    @GetMapping()
    public List<UserModel> getUserList(){
        final List<UserModel> userList = userService.getUserList();
        return userList;
    }

    @ApiOperation(value = "InsertUserInfo",notes = "")
    @PostMapping
    public int insertUserInfo(@RequestBody UserModel userModel){
        try{
            userService.insertUserInfo(userModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @PutMapping
    public int updateUserInfo(@RequestBody UserModel userModel){
        try{
            userService.updateUserInfo(userModel);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @DeleteMapping("/{id}")
    public int deleteUserInfo(@PathVariable int id){
        try{
            userService.deleteUserInfo(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
