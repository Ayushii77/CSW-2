import java.util.Scanner;
public class StringBuilderUsage {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial string: ");
sb.append(scanner.nextLine());
while (true) {
System.out.println("\n1. Add substring \n2. Remove characters \n3. Modify character
\n4. Concatenate string \n5. Show string \n6. Exit");
System.out.print("Choose operation: ");
int choice = scanner.nextInt();
scanner.nextLine();
switch (choice) {
case 1:
System.out.print("Enter substring and position: ");
String substr = scanner.nextLine();
int pos = scanner.nextInt();
sb.insert(pos, substr);
break;
}}
}