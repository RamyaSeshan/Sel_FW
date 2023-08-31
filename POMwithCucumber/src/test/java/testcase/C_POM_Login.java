package testcase;

import org.testng.annotations.DataProvider;


import base.BaseClass1;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/Login.feature",
glue="pages")


public class C_POM_Login extends BaseClass1{

	@DataProvider(parallel=true)
    public Object[][] scenarios() {
        
		return  super.scenarios();
		
	
    }
	
	  
}
