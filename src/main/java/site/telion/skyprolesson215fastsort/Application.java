package site.telion.skyprolesson215fastsort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.telion.skyprolesson215fastsort.service.IntegerList;
import site.telion.skyprolesson215fastsort.service.IntegerListImpl;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        IntegerListImpl integerList = new IntegerListImpl();
        integerList.sortTest();
    }

}
