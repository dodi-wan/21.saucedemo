package runnerTest;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


//Runner test menggunakan Junit5 dengan anotasi Junit5
//anotasi (masukan target lokasi folder di project)
@Suite
@IncludeEngines("cucumber")
@IncludeTags("test")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.com.stepdef, hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm, html:target/web-report.html") // Laporan dalam format JSON
@ConfigurationParameter(key = "allure.results.directory", value = "target/allure-results")

public class Runner {
}
