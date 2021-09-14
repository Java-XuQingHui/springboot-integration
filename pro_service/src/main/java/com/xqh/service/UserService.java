package com.xqh.service;

import com.xqh.domain.AjaxResult;
import com.xqh.entity.User;

/**
 * <p>简单描述该类的作用</p>
 *
 * @author xuqinghui
 * @create 2021/8/26 23:31
 */
public interface UserService {

	AjaxResult insert(User user);

	User getUserById(Integer id);

}
