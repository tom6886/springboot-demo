package tb.springboot.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("gdept")
public class GdeptEntity extends BaseEntity {
    private String name;

    private String code;
}
