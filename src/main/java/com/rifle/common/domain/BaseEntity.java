package com.rifle.common.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Schema(description = "实体类基础信息对象")
@Data
public class BaseEntity implements Serializable {

    @Schema(description = "创建人")
    @TableField(fill = FieldFill.INSERT)
    private Long createdBy;

    @Schema(description = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @Schema(description = "修改人")
    @TableField(fill = FieldFill.UPDATE)
    private Long updateBy;

    @Schema(description = "修改时间")
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "数据状态：0 草稿，1 使用")
    private Integer dataStatus;

    @Schema(description = "是否删除：0 否，1 是")
    @TableLogic
    private Integer isDelete;

    @Schema(description = "租户Id")
    @TableField(fill = FieldFill.INSERT)
    private Long tenantId;

    @Schema(description = "版本号")
    private Integer version;

}
