import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalesFileReader {

    public static void readSalesFile(String fileName, ProductMap productMap) {

        try (Scanner input = new Scanner(new File(fileName))) {

            while (input.hasNextLine()) {

                String line = input.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.trim().split("\\s+");

                if (data.length != 7) {
                    System.out.println("Invalid record: " + line);
                    continue;
                }

                try {

                    int customerId = Integer.parseInt(data[0]);
                    String firstName = data[1];
                    String lastName = data[2];
                    int productId = Integer.parseInt(data[3]);
                    String productName = data[4];
                    double price = Double.parseDouble(data[5]);
                    int items = Integer.parseInt(data[6]);

                    if (customerId <= 0 || productId <= 0 ||
                        price < 0 || items <= 0) {
                        System.out.println("Invalid record: " + line);
                        continue;
                    }

                    productMap.updateProduct(productId, productName, items);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Sales.txt file was not found.");
        }
    }
}
