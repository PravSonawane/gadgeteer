package com.merryapps.gadgeteer.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
	"classpath:xpadro/spring/web/configuration/root-context.xml",
	"classpath:xpadro/spring/web/configuration/app-context.xml"})
public class SeriesFunctionalBaseTests {
	
	protected void initializeDatabase() {
		
	}
}
