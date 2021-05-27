package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    @TableField(value = "age")
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    @TableLogic
    @TableField(value = "is_deleted")
    private Boolean deleted;
    @Version
    private Integer version;
}
