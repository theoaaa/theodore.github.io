package org.scau.internshipsystem.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.scau.internshipsystem.common.domain.PageQueryRequest;
import org.scau.internshipsystem.system.entity.Menu;
import org.scau.internshipsystem.system.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
public interface IUserService extends IService<User> {
    public IPage<User> findUserMessage(PageQueryRequest pageQueryRequest, User user);
    public User findUserMessageByUserId(int id);
    public User getUserByUsername(String username);
    public List<String> getMenuCodeByUserId(int userId);
}
