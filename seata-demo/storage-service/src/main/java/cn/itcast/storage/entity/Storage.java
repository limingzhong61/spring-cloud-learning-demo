package cn.itcast.storage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lmz
 */
@Data
@TableName("storage_tbl")
public class Storage {
    @TableId
    private Long id;
    private String commodityCode;
    private Integer count;
}
