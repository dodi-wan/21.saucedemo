package runnerTest;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;


//Runner test menggunakan Junit5 dengan anotasi Junit5
//anotasi (masukan target lokasi folder di project)
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdef, hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/web-report.html") // Laporan dalam format html
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@test")
@ConfigurationParameter(key = "allure.results.directory", value = "target/allure-results")

public class Runner {
}
