package com.alibaba.normandie.user;

import java.util.List;
import java.util.Set;

import com.alibaba.normandie.UserResult;
import com.alibaba.normandie.gateway.client.domain.request.ParamsDO;
import com.alibaba.normandie.user.querycondition.QueryCondition;

/**
 * Created by huangjun on 6/23/16.
 */
public interface UserService {

    UserResult<String> getApiKey(String email);

    UserResult<String> getApiKey(Integer userId);

    UserResult<User> getUser(String email);

    UserResult<User> getUser(Integer userId);

    UserResult<PageUser> findAll(QueryCondition condition);

    UserResult<Set<User>> findUsers(Set<Integer> userIds);

    UserResult<User> createUser(int operatorUserId, JoinInfo joinInfo);
    
    UserResult<User> updateUser(int operatorUserId, UpdateUserInfo updateUserInfo);

    UserResult<Void> changePassword(int userId, String oldpassword, String newPassword);

    UserResult<Void> resetPassword(int userId, String newPassword);

    UserResult<Void> activeUser(Integer operatorUser, Integer beActiveUser);

    UserResult<Void> inactiveUser(Integer operatorUser, Integer beInactiveUser);

    UserResult<User> auth(String email, String password);

    UserResult<Void> findPassword(String email);

    UserResult<List<User>> findUsersBySellerId(Integer sellerId);
    
    /**
     * api for gateway --createUser
     * @param paramsDO
     * @param body
     * @return
     */
    String createUser(ParamsDO paramsDO, String body);
}
