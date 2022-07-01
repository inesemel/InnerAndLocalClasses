import innerClassExample.User;
import innerClassExample.User.Supervisor;
import localClassExaple.SendMoney;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        User.Manager manager = user.new Manager("Inese", 60_000d);
        System.out.println("Manager's salary is " + manager.getSalary());

        User.Customer customer = user.new Customer();
        customer.name = "Julia";

        Supervisor supervisor = new Supervisor();
        supervisor.name = "Julian";


        SendMoney sendMoney = new SendMoney();

        sendMoney.sendByCard(123.45, 33221144L, 123, "02/24");
    }

}
