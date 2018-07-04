import java.sql.SQLOutput;
import java.util.Scanner;

public class TemplateForm
{
    public static void main(String[] args) {

        System.out.println("BUG REPORT TEMPLATE");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Defect Id : ");
        String ID = scanner.next();
        System.out.println();

        System.out.print("Enter Defect Description : ");
        String Description = scanner.next();
        System.out.println();

        System.out.print("Product Version : ");
        String version = scanner.next();
        System.out.println();

        System.out.print("Date Raised : ");
        String Date = scanner.next();
        System.out.println();

        System.out.print("Reported By : ");
        String Name = scanner.next();
        System.out.println();

        System.out.print("Status : ");
        String Status = scanner.next();
        System.out.println();

        System.out.print("Fixed By : ");
        String name = scanner.next();
        System.out.println();

        System.out.print("Date Closed : ");
        String date = scanner.next();
        System.out.println();

        System.out.print("Severity : ");
        String severity = scanner.next();
        System.out.println();

        System.out.print("Priority : ");
        String priority = scanner.next();
        System.out.println();

        System.out.print("Attachment : ");
        String attachment = scanner.next();
        System.out.println();

        System.out.println("Enter Defect Id : " + ID);
        System.out.println("Enter Defect Description : " + Description);
        System.out.println("Product Version : " + version);
        System.out.println("Date Raised : " + Date);
        System.out.println("Reported By : " + Name);
        System.out.println("Status : " + Status);
        System.out.println("Fixed By : " + name);
        System.out.println("Date Closed : " + date);
        System.out.println("Severity : " + severity);
        System.out.println("Priority : " + priority);
        System.out.println("Attachment : " + attachment);



    }
}
