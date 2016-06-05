package com.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.webservicex.GlobalWeatherSoap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext*.xml"})
public class WeatherReportTest {
	
	@Autowired
	private GlobalWeatherSoap globalWeatherSoap;
	
	
	@Test
	public void test1(){
		System.out.println(globalWeatherSoap.getCitiesByCountry("China"));
		System.out.println(globalWeatherSoap.getWeather("Shenzhen", "china"));
	}
}
