import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.OracleTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 1. @author: csd
 2. @date: 2021-03-22
 3. @description:
 */
public class MybatisPlusGenerator {
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		mpg.setTemplateEngine(new BeetlTemplateEngine());
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("D:\\DevelopmentCodes\\ideaProjects\\osp\\application\\src\\main\\java");// 自己的java目录
		gc.setFileOverride(true);// 是否覆盖
		gc.setActiveRecord(true);
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(false);// XML columList
		gc.setAuthor("xboV");

		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setMapperName("%sDAO");
		gc.setXmlName("%sDAOMapper");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");

		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.ORACLE);
		dsc.setTypeConvert(new OracleTypeConvert() {
			//           自定义数据库表字段类型转换
			@Override
			public IColumnType processTypeConvert(GlobalConfig gc, String fieldType) {
				return super.processTypeConvert(gc,fieldType);
			}
		});

		//配置数据源
		dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
		dsc.setUsername("opm");
		dsc.setPassword("System11");
		dsc.setUrl("jdbc:oracle:thin:@//localhost:1521/orcl");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
//        strategy.setTablePrefix(new String[]{"flow_"});// 此处修改为表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setInclude(new String[]{"SYS_USER"}); // 需要生成的表


		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.xzsoft.system");
		pc.setEntity("entity");
		pc.setMapper("mapper");
		pc.setXml("mapper.xml");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setController("controller");
		mpg.setPackageInfo(pc);

		// 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
		mpg.setCfg(cfg);
		// 执行生成
		mpg.execute();
		// 打印注入设置
		System.err.println(mpg.getCfg().getMap().get("abc"));
	}
}