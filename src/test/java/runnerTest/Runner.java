package runnerTest;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


//Runner test menggunakan Junit5 dengan anotasi Junit5
//anotasi (masukan target lokasi folder di project)

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.com.stepdef, hooks")
//@ConfigurationParameter(key = io.cucumber.junit.platform.engine.Constants.FEATURES_PROPERTY_NAME, value = "src/test/resources/features/login.feature")
//@ConfigurationParameter(key = io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME, value = "org/com/stepDef")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@smoke") // Hanya menjalankan scenario dengan tag @Login
//@ConfigurationParameter(key = io.cucumber.junit.platform.engine.Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false") // Pastikan dijalankan, bukan hanya pengecekan
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") // Laporan dalam format JSON

public class Runner {
}
