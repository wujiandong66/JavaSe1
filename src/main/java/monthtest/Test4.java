package monthtest;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
/*
* 有工人,农民,教师,科学家,服务生,其中,工人,农民,服务生只有基本工资.教师
* 除基本工资外,还有课酬(元/天),科学家除基本工资外,还有年终奖,请你写出相关
* 类,并编写测试类将各种类型的员工的全年工资打印出来。*/
public class Test4 {
    int salary;
    int jinben;
    int kechou;
    int yearaward;
    public void workerSalary(int jinben){
        salary=jinben*12;
        System.out.println(salary);
    }
    public void famerSalary(int jinben){
        salary=jinben*12;
        System.out.println(salary);
    }
    public void waiterSalary(int jinben){
        salary=jinben*12;
        System.out.println(salary);
    }
    public void techerSalary(int jinben,int kechou ){
        salary=jinben*12+kechou*365;
        System.out.println(salary);
    }
    public void scienceSalary(int jinben,int yearaward){
        salary=jinben*12+yearaward;
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Test4 test4=new Test4();
        test4.workerSalary(3000);
        test4.famerSalary(2500);
        test4.waiterSalary(2000);
        test4.techerSalary(5000,100);
        test4.scienceSalary(5000,10000);
    }
}
