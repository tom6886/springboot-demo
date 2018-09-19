package tb.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import tb.springboot.data.entity.GuserEntity;

import java.util.Map;

public interface IGuserService extends IService<GuserEntity> {
    Page<Map<String, Object>> queryPage(Map<String, Object> params);
}
