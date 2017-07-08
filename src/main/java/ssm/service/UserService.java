package ssm.service;



import ssm.model.User;

import java.util.List;

/**
 * Created by Zhangwl on 2016/7/8.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
