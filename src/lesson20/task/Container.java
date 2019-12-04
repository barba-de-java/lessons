package lesson20.task;

import com.sun.org.apache.xml.internal.security.Init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Container {
    Set<Class> classes;

    public Container(Set<Class> classes) {
        this.classes = classes;
    }

    public void init() {
        Server server = new Server();
        ServerSettings settings;
        for (Class cls : classes) {
            if (cls.isAnnotationPresent(ConfigClass.class)) {
                ConfigClass annotation =
                        (ConfigClass) cls.getDeclaredAnnotation(ConfigClass.class);
                try {
                    settings = buildServerSettings(annotation.prefix());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (cls.isAnnotationPresent(InitClass.class)){
                Field[] field = cls.getDeclaredFie;





            }
        }
    }

    private ServerSettings buildServerSettings(String inputString) throws IOException {
        ServerSettings settings = new ServerSettings();
        Properties properties = new Properties();
        properties.load(new FileInputStream(
                new File("resources/config.properties")));
    settings.setIp(properties.getProperty(inputString + ".ip"));
        settings.setPort(
                Integer.parseInt(properties.getProperty(inputString + ".port")));
        return settings;
    }
}
