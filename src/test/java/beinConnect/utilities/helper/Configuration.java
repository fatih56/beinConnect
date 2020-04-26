package beinConnect.utilities.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Configuration {

    private static Configuration instance;
    private Properties configProps = new Properties();




    public static Configuration getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
    }

    private Configuration() {
        InputStream is = null;

        try {
        /*    is = ClassLoader.getSystemResourceAsStream("config.properties");
            Reader reader = new InputStreamReader(is, "UTF-8");
            configProps.load(reader);
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

*/
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String[][] stringTo2DArray(String string) {
        String[][] datas = new String[(string.split("\\|\\|")).length][(string.split("\\|\\|")[0]).split(",").length];

        for (int i = 0; i < (string.split("\\|\\|")).length; i++) {
            datas[i] = (string.split("\\|\\|")[i]).split(",");
        }
        return datas;
    }

   }

