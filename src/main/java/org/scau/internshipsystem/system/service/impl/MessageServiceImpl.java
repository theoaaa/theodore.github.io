package org.scau.internshipsystem.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.scau.internshipsystem.system.entity.Message;
import org.scau.internshipsystem.system.mapper.MessageMapper;
import org.scau.internshipsystem.system.service.IMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
