package tb.springboot.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tb.springboot.data.dao.GuserDao;
import tb.springboot.data.entity.GuserEntity;
import tb.springboot.service.IGuserService;

import java.util.Map;

@Service("guserService")
public class GuserServiceImpl extends ServiceImpl<GuserDao, GuserEntity> implements IGuserService {
    @Override
    public Page<Map<String, Object>> queryPage(Map<String, Object> params) {
        Page<Map<String, Object>> page = new Page<>(Integer.valueOf(params.get("page").toString()), Integer.valueOf(params.get("limit").toString()));
        page.setRecords(this.baseMapper.queryPage(page, params));
        return page;
    }
}
