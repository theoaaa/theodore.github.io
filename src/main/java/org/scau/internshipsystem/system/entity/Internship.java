package org.scau.internshipsystem.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author guest
 * @since 2019-08-16
 */
@Data
public class Internship {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String company;

    private String job;

    private String address;

    private LocalDate beginDate;

    private LocalDate endDate;

    private Integer quota;

    private Integer number;

    private Integer isDelete;

    private Integer isPublish;

    private String filepath;

    private String remark;


}
