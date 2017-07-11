package AnnotationTest;

import src.main.resources.Annotation.JDBCConfig;

/**
 * Created by Administrator on 2017/7/11.
 */
@JDBCConfig(ip = "127.0.0.1", database = "test", encoding = "UTF-8", loginName = "root", password = "admin")
public class TestJDBCConfig {
    public static void main(String[] args){
 test();
    }
    public static void test(){
        JDBCConfig config = TestJDBCConfig.class.getAnnotation(JDBCConfig.class);
        System.out.println(config.ip());
    }
}
