import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Example.txt");        //Customize me
        createFile(file);
        writeFile(file);
        readFile(file);
    }

    public static void createFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File has been created successfully.");
            } catch (IOException e) {
                System.out.println("There is an error occured.\n" + e.getMessage());
            }
        } else {
            System.out.println("Error\nThis folder already exists.");
        }
    }

    public static void readFile(File file) {
        try {
            int i = 1;
            String line;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(i + ". " + line);
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is an error occured.\n" + e.getMessage());
        }
    }

    public static void writeFile(File file) {
        try {
            String check = "exit";
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter a word or sentence except 'exit': ");
                String input = scanner.nextLine();
                if (input.equals(check)) {
                    return;
                } else {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    writer.newLine();
                    writer.write(input);
                    writer.close();
                }
            }
        } catch (IOException e) {
            System.out.println("There is an error occured.\n" + e.getMessage());
        }
    }
}