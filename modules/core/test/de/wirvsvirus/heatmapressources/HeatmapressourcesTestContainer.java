package de.wirvsvirus.heatmapressources;

import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.ArrayList;
import java.util.Arrays;

public class HeatmapressourcesTestContainer extends TestContainer {

    public HeatmapressourcesTestContainer() {
        super();
        //noinspection ArraysAsListWithZeroOrOneArgument
        appComponents = new ArrayList<>(Arrays.asList(
                // list add-ons here: "com.haulmont.reports", "com.haulmont.addon.bproc", etc.
                "com.haulmont.cuba"
        ));
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the core module
                "de/wirvsvirus/heatmapressources/app.properties",
                // Add this file which is located in WirVsVirus and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "de/wirvsvirus/heatmapressources/test-app.properties");
        autoConfigureDataSource();
    }

    

    public static class Common extends HeatmapressourcesTestContainer {

        public static final HeatmapressourcesTestContainer.Common INSTANCE = new HeatmapressourcesTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void beforeAll(ExtensionContext extensionContext) throws Exception {
            if (!initialized) {
                super.beforeAll(extensionContext);
                initialized = true;
            }
            setupContext();
        }
        

        @SuppressWarnings("RedundantThrows")
        @Override
        public void afterAll(ExtensionContext extensionContext) throws Exception {
            cleanupContext();
            // never stops - do not call super
        }
        
    }
}
