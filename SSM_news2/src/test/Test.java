package test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import com.jinglun.news.dao.detailMapper;
import com.jinglun.news.entity.detail;
import com.jinglun.news.entity.detailExample;
import com.jinglun.news.entity.detailExample.Criteria;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("applicationContext.xml");
		detailMapper de= (detailMapper) spring.getBean("detailMapper");
		detailExample ex = new detailExample();
		Criteria  c = ex.createCriteria();
		PageHelper.startPage(1,5);
		List<detail> l = de.selectByExample(null);
		if(l.size()==0){
			System.out.println("meiyoushuju");
		}
		for (detail detail : l) {
			System.out.println(detail.getTitle());
		}
	}
	public static void staart() throws Exception{
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("D:/Workspaces/SSM_news2/src/generatorConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
		
	}

}
