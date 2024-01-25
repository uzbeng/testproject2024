package lesson17;

import org.testng.annotations.DataProvider;

public class DataSets {

    @DataProvider(name = "user-credentials")
    public Object[][] getData() {
        // This data can be pulled from DB/ExcelSheet/Or any other resources
        Object[][] data = new Object[4][2];

        data[0][0] = "user1";
        data[0][1] = "password1";

        data[1][0] = "user2";
        data[1][1] = "password2";

        data[2][0] = "user3";
        data[2][1] = "password3";

        data[3][0] = "user4";
        data[3][1] = "password4";

        return data;
    }
}
