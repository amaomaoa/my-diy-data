package com.ruoyi.my.domain.bo;

import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.*;

import java.util.Date;

import java.math.BigDecimal;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配件信息业务对象 diy_accessories
 *
 * @author ruoyi
 * @date 2022-11-29
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class DiyAccessoriesBo extends BaseEntity {

    /**
     * 配件id
     */
    @NotNull(message = "配件id不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 配件名
     */
    @NotBlank(message = "配件名不能为空", groups = { AddGroup.class, EditGroup.class })
    private String name;

    /**
     *  配件编号
     */
    @NotBlank(message = " 配件编号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String url;

    /**
     * 配件价格
     */
    private BigDecimal price;


}