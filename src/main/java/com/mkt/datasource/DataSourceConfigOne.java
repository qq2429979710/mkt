package com.mkt.datasource;

import com.mkt.util.PropertiesUtils;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.mkt.mysqlmapper", sqlSessionTemplateRef = "SqlSessionTemplateOne")
public class DataSourceConfigOne {

    @Value("${spring.datasource.type}")
    private String dataSourceType;

    @Autowired
    private Environment env;

    @Value("${mybatis.mapperLocations}")
    private String mapper_location;

    @Value("${mybatis.configuration.map-underscore-to-camel-case}")
    private boolean mapUnderscoreToCamelCase;


    @Bean(name = "mybatisConfigurationOne")
    public org.apache.ibatis.session.Configuration mybatisConfigurationOne(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(mapUnderscoreToCamelCase);
        configuration.setDefaultExecutorType(ExecutorType.REUSE);
        return  configuration;
    }


    @Primary
    @Bean(name = "datasourceOne")
    public DataSource datasourceOne() {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        Properties prop = PropertiesUtils.build(env,"spring.datasource.druid.one.");
        ds.setXaDataSourceClassName(dataSourceType);
        ds.setPoolSize(5);
        ds.setXaProperties(prop);
        return ds;
    }
    @Primary
    @Bean(name = "SqlSessionFactoryOne")
    public SqlSessionFactory SqlSessionFactoryOne(@Qualifier("datasourceOne") DataSource dataSource,
                                                  @Qualifier("mybatisConfigurationOne")org.apache.ibatis.session.Configuration configuration) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setConfiguration(configuration);
        return bean.getObject();
    }

    @Primary
    @Bean(name = "SqlSessionTemplateOne")
    public SqlSessionTemplate SqlSessionTemplateOne(@Qualifier("SqlSessionFactoryOne") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }



}
