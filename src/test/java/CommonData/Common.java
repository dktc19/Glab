package CommonData;

import utils.ReadingJson;

import java.util.List;

public class Common {
    public static final String DATA_TEST_FILE_PATH_COMMON = System.getProperty("user.dir")
            + "/src/test/java/test_data_files/Data.json";
    public static ReadingJson jsonUtil = new ReadingJson();

    public static String url = jsonUtil.getStringUTF8(DATA_TEST_FILE_PATH_COMMON,"URL_GLAB_TEST");

    public static List list_account = jsonUtil.docFileJSON(DATA_TEST_FILE_PATH_COMMON, "LIST_ACCOUNT");
}
