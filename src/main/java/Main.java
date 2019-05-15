import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar   cal_1= Calendar.getInstance();//获取当前日期
                  cal_1.add(Calendar.MONTH, -1);
                  cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
                  format.format(cal_1.getTime());
        cal_1.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("dfd");
        /*cal_1.getActualMaximum()*/



    }
}
