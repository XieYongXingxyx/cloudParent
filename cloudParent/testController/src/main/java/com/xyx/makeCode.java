package com.xyx;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @author xyx
 * @TIME 2019/11/15 18:06
 * 代码生产器
 */
public class makeCode {
    public static void main(String[] args) {

        //全局配置
        AutoGenerator autoGenerator = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Velocity
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("XYX");
        globalConfig.setOutputDir("F:/gitTest/cloudParent/mybatisplugsDemo/src/main/java");
        globalConfig.setFileOverride(false);//文件名相同是否覆盖
        globalConfig.setEnableCache(false);//xml二级缓存
        globalConfig.setBaseResultMap(true);//resultMap
        globalConfig.setBaseColumnList(false);
        //设置生成后文件名---》%s为自动填充文件名
        globalConfig.setMapperName("%sDao");
        globalConfig.setXmlName("%sMapper");
        globalConfig.setServiceImplName("%sServiceImpl");
        globalConfig.setServiceName("%sService");
        globalConfig.setControllerName("%sController");

        autoGenerator.setGlobalConfig(globalConfig);
        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8");
        autoGenerator.setDataSource(dataSourceConfig);
        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.nochange);
        strategyConfig.setInclude("user");
        autoGenerator.setStrategy(strategyConfig);
        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.xyx");
        packageConfig.setController("controller");
        packageConfig.setEntity("model");
        autoGenerator.setPackageInfo(packageConfig);
        //执行
        autoGenerator.execute();
    }
}
