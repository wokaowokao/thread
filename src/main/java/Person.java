import java.util.Date;

/**
 * 普通类多参数 实现
 */
public class Person {
    private String name;
    private Boolean sex;
    private Date brithday;
    private Integer age;
    private String weight;


    public Person(String name, Boolean sex, Date brithday, Integer age, String weight){
        this.name = name;
        this.sex = sex;
        this.brithday = brithday;
        this.age = age;
        this.weight = weight;
    }
    public Person(String name){
        this(name, true, new Date(), 0, "");
    }
    public Person(String name, Boolean sex){
        this(name, sex, new Date(), 0, "");

    }
}
