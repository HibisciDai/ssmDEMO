package src.main.resources.Annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/7/11.
 */
@Target({ElementType.METHOD,ElementType.TYPE})//可以用在方法上，也可以用在类上
@Retention(RetentionPolicy.RUNTIME) //运行时注解
@Inherited// 可继承
@Documented// 表示当执行javadoc的时候，本注解会生成相关文档
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}
