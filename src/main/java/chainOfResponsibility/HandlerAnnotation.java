package chainOfResponsibility;

import java.lang.annotation.*;

/**
 * @author ：程智超
 * @date ：Created in 2021/5/7
 * @description：处理器的优先级注解。
 */


@Inherited                                  //允许子类继承父类中的注解
@Documented                                 //将注解包含在JavaDoc中
@Target(value = ElementType.TYPE)           //注解可以用于什么地方
@Retention(value = RetentionPolicy.RUNTIME) //表示需要在什么级别保存该注解信息
public @interface HandlerAnnotation {
    int offset() default 0;
}
