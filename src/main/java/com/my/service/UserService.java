package com.my.service;

import com.my.entity.MpAppUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.my.repository.MpAppUsersRespository;

@Service
public class UserService {
    @Autowired
    private MpAppUsersRespository userRepositoty;

    public MpAppUsers findUserByLoginId(String loginId){
        MpAppUsers user = null;
        try{
            user = userRepositoty.findUser(loginId);
        }catch (Exception e){}
        return user;
    }
}
