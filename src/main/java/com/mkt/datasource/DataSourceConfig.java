/*
package com.mkt.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

*/
/*
 *   @author 孟开通
 *   @date   2020/6/27 - 14:23
 *//*

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Value("${spring.datasource.type}")
    private String dataSourceType;

    */
/**
     * 配置主数据源，多数据源中必须要使用@Primary指定一个主数据源
     * 其次DataSource里用的是DruidXADataSource ，而后注册到AtomikosDataSourceBean并且返回
     * @return
     *//*

    @Primary
    @Bean(name = "datasourceOne")
    public DataSource datasourceOne() {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        Properties prop = build(env, "spring.datasource.druid.one.");
        ds.setXaDataSourceClassName(dataSourceType);
        ds.setPoolSize(5);
        ds.setXaProperties(prop);
        return ds;
    }

    */
/**
     * 配置次数据源
     * 其次DataSource里用的是DruidXADataSource ，而后注册到AtomikosDataSourceBean并且返回
     * @return
     *//*

    @Bean(name = "dataSourceTwo")
    public DataSource datasourceTwo() {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        Properties prop = build(env, "spring.datasource.druid.two.");
        ds.setXaDataSourceClassName(dataSourceType);
        ds.setPoolSize(5);
        ds.setXaProperties(prop);
        return ds;
    }

    private Properties build(Environment env, String prefix) {
        Properties prop = new Properties();
        String property = env.getProperty(prefix + "name");
        System.out.println(property);
        prop.put("name", env.getProperty(prefix + "name"));
        prop.put("url", env.getProperty(prefix + "url"));
        prop.put("username", env.getProperty(prefix + "username"));
        prop.put("password", env.getProperty(prefix + "password"));
        prop.put("driverClassName", env.getProperty(prefix + "driverClassName", ""));
        prop.put("filters", env.getProperty(prefix + "filters"));
        prop.put("maxActive", env.getProperty(prefix + "maxActive", Integer.class));
        prop.put("initialSize", env.getProperty(prefix + "initialSize", Integer.class));
        prop.put("maxWait", env.getProperty(prefix + "maxWait", Integer.class));
        prop.put("minIdle", env.getProperty(prefix + "minIdle", Integer.class));
        prop.put("timeBetweenEvictionRunsMillis",
                env.getProperty(prefix + "timeBetweenEvictionRunsMillis", Integer.class));
        prop.put("minEvictableIdleTimeMillis", env.getProperty(prefix + "minEvictableIdleTimeMillis", Integer.class));
        prop.put("validationQuery", env.getProperty(prefix + "validationQuery"));
        prop.put("testWhileIdle", env.getProperty(prefix + "testWhileIdle", Boolean.class));
        prop.put("testOnBorrow", env.getProperty(prefix + "testOnBorrow", Boolean.class));
        prop.put("testOnReturn", env.getProperty(prefix + "testOnReturn", Boolean.class));
        prop.put("poolPreparedStatements", env.getProperty(prefix + "poolPreparedStatements", Boolean.class));
        prop.put("maxOpenPreparedStatements", env.getProperty(prefix + "maxOpenPreparedStatements", Integer.class));
        return prop;
    }
}
*/
