
import com.tw.billingsystem.Customer;
import com.tw.billingsystem.Invoice;
import com.tw.io.*;

import java.io.IOException;
import java.util.Scanner;

import static com.tw.billingsystem.Constants.*;

public class BillingSystem {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        System.out.println(enterChoiceMessage);

        int choice = scanner.nextInt();
        if (choice == fileReaderChoice) {
            reader = new TextFileReader();
        }

        Customer customer = reader.read();
        Invoice invoice = customer.generateInvoice();
        writer.write(invoice);
    }
}
