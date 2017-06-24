package com.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.webservicex.GlobalWeatherSoap;

import cn.com.webxml.QqOnlineWebService;
import cn.com.webxml.QqOnlineWebServiceSoap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext*.xml"})
public class WeatherReportTest {
	
	@Autowired
	private GlobalWeatherSoap globalWeatherSoap;
	
	@Autowired
	private QqOnlineWebServiceSoap qqOnlineWebServiceSoap;
	
	@Test
	public void test1(){
		System.out.println(globalWeatherSoap.getCitiesByCountry("China"));
		System.out.println(globalWeatherSoap.getWeather("Shenzhen", "china"));
	}
	
	@Test
	public void test2(){
		System.out.println(qqOnlineWebServiceSoap.qqCheckOnline("673820543"));
	}
	
	/**
	 * 不通过 Spring 调用
	 */
	@Test
	public void test3(){
		QqOnlineWebService qqOnlineWebService = new QqOnlineWebService();
		QqOnlineWebServiceSoap qqOnlineWebServiceSoap = qqOnlineWebService.getQqOnlineWebServiceSoap();
		String result = qqOnlineWebServiceSoap.qqCheckOnline("673820543");
		System.out.println(result);
	}
}
