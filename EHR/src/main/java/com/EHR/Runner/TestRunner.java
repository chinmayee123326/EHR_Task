package com.EHR.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Eclipse_Neon\\Eclipse\\EHR\\src\\main\\java\\com\\EHR\\Features\\Ehr.feature"
, glue="com/EHR/StepDefinations"
,format= {"pretty","html:test-outout","json:json-outpu/cucumber.json","junit:junit-xml/cucumber.xml"}
,dryRun = false
,monochrome=true
,strict=true
)
public class TestRunner {

}
