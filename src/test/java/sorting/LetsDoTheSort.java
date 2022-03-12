package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LetsDoTheSort {
    public static void main(String[] args) {


                System.setProperty("webdriver.chrome.driver","resources/chromedriver");
//        System.setProperty("webdriver.chrome.silentOutput", "true");
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");

        int rowSize = 5;
        ArrayList<TableData> list = new ArrayList<>();
        for (int i = 1; i < rowSize; i++) {

            WebElement fat = driver.findElement(By.xpath("//div/table/tr[" + i + "]/td[3]"));

            WebElement dessert =driver.findElement(By.xpath("//div/table/tr[" + i + "]/td[1]"));


            int fatValue = Integer.parseInt(fat.getText());
            list.add(new TableData(fatValue, dessert.getText()));

             System.out.println(fat.getText());
             System.out.println(dessert.getText());
        }
        System.out.println("before sorting " + list);
        Collections.sort(list);
        System.out.println("After sorting " + list);
        list.forEach(i -> {
            System.out.println("| Dessert: " + i.dessert + " |  Fat: " + i.fat +"  |" );
        });

        driver.quit();

    }
}

class TableData implements Comparable<TableData> {

    Integer fat;
    String dessert;

    public TableData(Integer fat, String dessert) {
        this.fat = fat;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "TableData [dessert=" + dessert + ", fat= " + fat + "]";
    }

    @Override
    public int compareTo(TableData data) {
        if (this.fat < data.fat) {
            return -1;
        } else
            return 0;

    }

}