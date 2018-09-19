package tb.springboot.common.aspect;

import cn.hutool.core.date.DateTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import tb.springboot.data.entity.BaseEntity;

import java.util.Collection;

@Aspect
@Component
public class AutoModelAspect {
    @Pointcut("@annotation(tb.springboot.common.annotation.AutoModel)")
    public void autoModelCut() {

    }

    @Before("autoModelCut()")
    public void dataFilter(JoinPoint point) {
        Object[] params = point.getArgs();
        for (Object param : params) {
            if (param instanceof BaseEntity) {
                insertCreator(param);
                return;
            }

            if (param instanceof Collection && !((Collection) param).isEmpty()) {
                for (Object item : ((Collection) param)) {
                    if (item instanceof BaseEntity) {
                        insertCreator(item);
                    }
                }
                return;
            }
        }
    }

    private void insertCreator(Object entity) {
        if (((BaseEntity) entity).getId() == null) {
            ((BaseEntity) entity).setCreateUser(1L);
            ((BaseEntity) entity).setCreateDate(DateTime.now());
        }
        ((BaseEntity) entity).setUpdateUser(1L);
        ((BaseEntity) entity).setUpdateDate(DateTime.now());
    }
}
