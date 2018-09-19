package tb.springboot.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("guser")
public class GuserEntity extends BaseEntity {
    private String name;

    private Integer age;

    private Long deptId;
}
