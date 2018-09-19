package tb.springboot.data.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Long id;

    private Long createUser;

    private Date createDate;

    private Long updateUser;

    private Date updateDate;
}
