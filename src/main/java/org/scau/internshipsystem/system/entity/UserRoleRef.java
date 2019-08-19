package org.scau.internshipsystem.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
 * <p>
 * 
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
@Data
public class UserRoleRef {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @NotNull(message = "userId 不能为空")
    private Integer userId;

    @NotNull(message = "roleId 不能为空")
    private Integer roleId;


}
