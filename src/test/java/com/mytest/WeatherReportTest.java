package com.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.webxml.QqOnlineWebServiceSoap;
import net.webservicex.GlobalWeatherSoap;

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
}
