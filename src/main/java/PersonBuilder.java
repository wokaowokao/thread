import java.util.Date;

/**
 * builder类多参数
 */
public class PersonBuilder {
    private String name;
    private Boolean sex;
    private Date brithday;
    private Integer age;
    private String weight;

    private PersonBuilder(Builder builder){
        name = builder.name;
        sex = builder.sex;
        brithday = builder.brithday;
        age = builder.age;
        weight = builder.weight;
    }
    public static class Builder{
        String name;
        Boolean sex = true;
        Date brithday = new Date();
        Integer age = 0;
        String weight = "";

        public Builder(String name){
            this.name = name;
        }
        public Builder sex(Boolean sex){
            this.sex = sex;
            return this;
        }
        public Builder brithday(Date brithday){
            this.brithday = brithday;
            return this;
        }
        public Builder age(Integer age){
            this.age = age;
            return this;
        }
        public Builder weight(String weight){
            this.weight = weight;
            return this;
        }
        public PersonBuilder build(){
            return new PersonBuilder(this);
        }

    }


}
