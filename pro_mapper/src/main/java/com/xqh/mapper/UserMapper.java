package com.xqh.mapper;

import com.xqh.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <p>简单描述该类的作用</p>
 *
 * @author xuqinghui
 * @create 2021/8/27 00:33
 */

public interface UserMapper {

    int insert(User user);

    User getUserById(Integer id);

}
