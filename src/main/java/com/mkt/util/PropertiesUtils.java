package com.mkt.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Properties;



public  class PropertiesUtils {


    public static Properties build(Environment env,String prefix) {
        Properties prop = new Properties();
        String property = env.getProperty(prefix + "name");
        System.out.println(property);
        //连接
        prop.put("name", env.getProperty(prefix + "name"));
        prop.put("url", env.getProperty(prefix + "url"));
        prop.put("username", env.getProperty(prefix + "username"));
        prop.put("password", env.getProperty(prefix + "password"));
        prop.put("driverClassName", env.getProperty(prefix + "driverClassName", ""));
        //连接池
        // #初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
        prop.put("initialSize", env.getProperty(prefix + "initialSize", Integer.class));
        //# 最大连接池个数
        prop.put("maxActive", env.getProperty(prefix + "maxActive", Integer.class));
        //最小连接池数量
        prop.put("minIdle", env.getProperty(prefix + "minIdle", Integer.class));
        //配置获取连接等待超时的时间，单位毫秒，缺省启用公平锁，并发效率会有所下降
        prop.put("maxWait", env.getProperty(prefix + "maxWait", Integer.class));
        //用来检测连接是否有效的sql，要求是一个查询语句
        prop.put("validationQuery", env.getProperty(prefix + "validationQuery"));
        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        prop.put("timeBetweenEvictionRunsMillis", env.getProperty(prefix + "timeBetweenEvictionRunsMillis", Integer.class));
        //申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
        prop.put("testOnBorrow", env.getProperty(prefix + "testOnBorrow", Boolean.class));
        //归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        prop.put("testOnReturn", env.getProperty(prefix + "testOnReturn", Boolean.class));
        //建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
        prop.put("testWhileIdle", env.getProperty(prefix + "testWhileIdle", Boolean.class));
        //连接保持空闲而不被驱逐的最长时间
        prop.put("minEvictableIdleTimeMillis", env.getProperty(prefix + "minEvictableIdleTimeMillis", Integer.class));
        //是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
        prop.put("poolPreparedStatements", env.getProperty(prefix + "poolPreparedStatements", Boolean.class));
        prop.put("maxPoolPreparedStatementPerConnectionSize", env.getProperty(prefix + "maxPoolPreparedStatementPerConnectionSize", Integer.class));
        //表示在回收连接的时候，在日志中输出回收的连接的信息，包括是在哪用的这个连接，可以用来追踪连接溢出
        prop.put("logAbandoned", env.getProperty(prefix + "logAbandoned", Boolean.class));
        //超过时间限制是否回收
        prop.put("removeAbandoned", env.getProperty(prefix + "removeAbandoned", Boolean.class));
        //超时时间；单位为秒。180秒=3分钟
        prop.put("removeAbandonedTimeout", env.getProperty(prefix + "removeAbandonedTimeout", Integer.class));
        //超时时间：如果没有归还，则强制关闭
        prop.put("removeAbandonedTimeoutMillis", env.getProperty(prefix + "removeAbandonedTimeoutMillis", Integer.class));
        prop.put("filters", env.getProperty(prefix + "filters", String.class));
        return prop;
    }
}
