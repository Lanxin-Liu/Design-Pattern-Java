import factory.AbstractFactory;

import java.util.Scanner;

/**
 * @className: Application
 * @description:
 * @author: Shidan Cheng
 * @date: 5:54 下午 2019/10/22
 * @version: v1.0
 */
public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static String symbol = "";

    public static void welcome() {
        System.out.println("*-=======================   USAGE INFO   =============================-*");
        System.out.println("|                      [d]  Directory                                  |");
        System.out.println("|                      [q]  Exit                                       |");
        System.out.println("*-====================================================================-*");
    }

    public static void showDirectory() {
        System.out.println("*-=======================   Design Patterns  =========================-*");
        System.out.println("|                      [d]  Directory                                  |");
        System.out.println("|                      [q]  Exit                                       |");
        System.out.println("|                      [1]  Abstract Factory                           |");
        System.out.println("|                      [2]  Builder                                    |");
        System.out.println("|                      [3]  Factory Method                             |");
        System.out.println("|                      [4]  Object Pool                                |");
        System.out.println("|                      [5]  Prototype                                  |");
        System.out.println("|                      [6]  Singleton                                  |");
        System.out.println("|                      [7]  Adaptor                                    |");
        System.out.println("|                      [8]  Bridge                                     |");
        System.out.println("|                      [9]  Composite                                  |");
        System.out.println("|                     [10]  Decorator                                  |");
        System.out.println("|                     [11]  Facade                                     |");
        System.out.println("|                     [12]  Flyweight                                  |");
        System.out.println("|                     [13]  PrivateClassData                           |");
        System.out.println("|                     [14]  Proxy                                      |");
        System.out.println("|                     [15]  ChainOfResponsibility                      |");
        System.out.println("|                     [16]  Command                                    |");
        System.out.println("|                     [17]  Interpreter                                |");
        System.out.println("|                     [18]  Iterator                                   |");
        System.out.println("|                     [19]  Mediator                                   |");
        System.out.println("|                     [20]  Memento                                    |");
        System.out.println("|                     [21]  NullObject                                 |");
        System.out.println("|                     [22]  Observer                                   |");
        System.out.println("|                     [23]  State                                      |");
        System.out.println("|                     [24]  Strategy                                   |");
        System.out.println("|                     [25]  TemplateMethod                             |");
        System.out.println("|                     [26]  Visitor                                    |");
        System.out.println("|                     [27]  Filer                                      |");
        System.out.println("|                     [28]  CompositeEntity                            |");
        System.out.println("|                     [29]  Specification                              |");
        System.out.println("|                     [30]  DoubleClickChecking                        |");
        System.out.println("*-====================================================================-*");
    }

    public static void main(String[] args) {
        welcome();
        System.out.printf("> 请输入指令: ");
        if (scanner.hasNext()) {
            symbol = scanner.next();
        }
        while (!symbol.equals("q")) {
            switch (symbol){
                case "d":
                    showDirectory();break;
                case "q":
                    System.exit(0);break;
                case "1":

                    break;
                case "2":
                    BridgeDemo.main(args);
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    PrototypeDemo.main(args);
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    BridgeDemo.main(args);
                    break;
                case "9":
                    break;
                case "10":
                    DecoratorDemo.main(args);
                    break;
                case "11":
                    break;
                case "12":
                    break;
                case "13":
                    break;
                case "14":
                    PrototypeDemo.main(args);
                    break;
                case "15":
                    break;
                case "16":
                    break;
                case "17":
                    break;
                case "18":
                    IteratorDemo.main(args);
                    break;
                case "19":
                    break;
                case "20":
                    break;
                case "21":
                    break;
                case "22":
                    break;
                case "23":
                    StateDemo.main(args);
                    break;
                case "24":
                    break;
                case "25":
                    break;
                case "26":
                    break;
                case "27":
                    break;
                case "28":
                    break;
                case "29":
                    break;
                case "30":
                    break;
                default:
                    System.out.println("> [ERROR] 指令不存在!");
            }
            System.out.printf("> 请输入指令: ");
            if (scanner.hasNext()) {
                symbol = scanner.next();
            }
        }
    }
}
