package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"test@gmail.com","test123"},
                {"test2@gmail.com","test456"},
                {"test3@gmail.com","test315"},

        };
        return data;
    }
}
