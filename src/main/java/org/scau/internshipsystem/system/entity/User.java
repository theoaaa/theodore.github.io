package org.scau.internshipsystem.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.scau.internshipsystem.common.util.DateUtil;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @NotBlank(message = "account 不能为空")
    private String account;

    @NotBlank(message = "username 不能为空")
    private String username;

    @NotBlank(message = "password 不能为空")
    private String password;

    @NotNull(message = "username 不能为空")
    private Integer state;

    @NotBlank(message = "grade 不能为空")
    private String grade;

    @NotBlank(message = "subject 不能为空")
    private String subject;

    @NotBlank(message = "subject 不能为空")
    private String email;

    @TableField(exist = false)
    private List<Role> roleList;

    private Integer internshipRef;

    private Integer offerRef;

    private String registerTime;

    private String lastLoginTime;

    public void setRegisterTime(Date registerTime) {
        this.registerTime = DateUtil.formatFullTime(registerTime, DateUtil.FULL_TIME_SPLIT_PATTERN);
    }
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = DateUtil.formatFullTime(lastLoginTime, DateUtil.FULL_TIME_SPLIT_PATTERN);
    }
}
