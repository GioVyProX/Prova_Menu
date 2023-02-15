import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) {

        secondCourses menu = new secondCourses();
        Beverages menuBeverages = new Beverages();
        MainCourses menuMainCourses = new MainCourses();

        ArrayList<String> order = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        printMenu();
        int number = parseInt(scanner.nextLine());

        ChoseSelectionOfMenu(number, menu, menuBeverages, order, scanner, menuMainCourses);
    }
    static void printMenu () {
        System.out.println("Restaurant Team 3 ");
        System.out.println("Menu: ");
        System.out.println("1 -> Appetizers");
        System.out.println("2 -> Main courses");
        System.out.println("3 -> Second Dishes");
        System.out.println("4 -> Beverages");
        System.out.println("5 -> Dessert");
        System.out.println("0 -> To end your order");
        System.out.println("finish -> Exit the current page");
        System.out.println("Insert the number referred to the selection you want to visit");
    }

    static void ChoseSelectionOfMenu (Integer input, secondCourses menu, Beverages menuBeverages, ArrayList<String> order, Scanner scanner, MainCourses menuMainCourses){

        while (input != 0) {

            switch (String.valueOf(input)) {
                case "1":
                    System.out.println("Appetizers");
                   /* System.out.println("1 ->" +menuMainCourses.amatriciana + " " + menuMainCourses.priceBucatini + "€");
                    System.out.println("2 ->" + menuMainCourses.carbonara + " " + menuMainCourses.priceCarbonarra + "€");
                    System.out.println("3 ->" +menuMainCourses.ragu + " " + menuMainCourses.priceRagu + "€");
                    System.out.println("4 ->" + menuMainCourses.bolognese + " " + menuMainCourses.priceBolognese + "€");
                    System.out.println("5 ->" +menuMainCourses.spaghetti + " " + menuMainCourses.priceSpaghetti + "€");
                    String mainCoursesInput = scanner.nextLine();
                    while (!Objects.equals(mainCoursesInput, "0")){

                        switch (String.valueOf(mainCoursesInput)){

                            case "1":
                                order.add(menuMainCourses.amatriciana);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "2" :
                                order.add(menuMainCourses.carbonara);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "3":
                                order.add(menuMainCourses.ragu);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "4" :
                                order.add(menuMainCourses.bolognese);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "5":
                                order.add(menuMainCourses.spaghetti);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "end":
                                System.out.println("Beverages added to order :)");
                                mainCoursesInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                mainCoursesInput = "0";
                                break;
                        }*/
                    break;
                case "2":
                    System.out.println("Main courses");
                    System.out.println("1 ->" +menuMainCourses.amatriciana + " " + menuMainCourses.priceBucatini + "€");
                    System.out.println("2 ->" + menuMainCourses.carbonara + " " + menuMainCourses.priceCarbonarra + "€");
                    System.out.println("3 ->" +menuMainCourses.ragu + " " + menuMainCourses.priceRagu + "€");
                    System.out.println("4 ->" + menuMainCourses.bolognese + " " + menuMainCourses.priceBolognese + "€");
                    System.out.println("5 ->" +menuMainCourses.spaghetti + " " + menuMainCourses.priceSpaghetti + "€");
                    String mainCoursesInput = scanner.nextLine();
                    while (!Objects.equals(mainCoursesInput, "0")){

                        switch (String.valueOf(mainCoursesInput)){

                            case "1":
                                order.add(menuMainCourses.amatriciana);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "2" :
                                order.add(menuMainCourses.carbonara);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "3":
                                order.add(menuMainCourses.ragu);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "4" :
                                order.add(menuMainCourses.bolognese);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "5":
                                order.add(menuMainCourses.spaghetti);
                                System.out.println("Your order now is : " + order);
                                mainCoursesInput = "0";
                                break;

                            case "end":
                                System.out.println("Beverages added to order :)");
                                mainCoursesInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                mainCoursesInput = "0";
                                break;
                        }

                    }
                    break;
                case "3":
                    System.out.println("Second Dishes");
                    System.out.println("1 ->" +menu.first + " " + menu.firstPrice + "€");
                    System.out.println("2 ->" + menu.second + " " + menu.secondPrice + "€");
                    System.out.println("3 ->" +menu.third + " " + menu.thirdPrice + "€");
                    System.out.println("4 ->" + menu.fourth + " " + menu.fourthPrice + "€");
                    System.out.println("5 ->" +menu.last + " " + menu.lastPrice + "€");
                    String secondDishesInput = scanner.nextLine();
                    while (!Objects.equals(secondDishesInput, "0")){
                        switch (String.valueOf(secondDishesInput)){
                            case "1":
                                order.add(menu.first);
                                System.out.println("Your order now is : " + order);
                                secondDishesInput = "0";
                                break;

                            case "2" :
                                order.add(menu.second);
                                System.out.println("Your order now is : " + order);
                                secondDishesInput = "0";
                                break;

                            case "3":
                                order.add(menu.third);
                                System.out.println("Your order now is : " + order);
                                secondDishesInput = "0";
                                break;

                            case "4" :
                                order.add(menu.fourth);
                                System.out.println("Your order now is : " + order);
                                secondDishesInput = "0";
                                break;

                            case "5":
                                order.add(menu.last);
                                System.out.println("Your order now is : " + order);
                                secondDishesInput = "0";
                                break;

                            case "end":
                                System.out.println("Beverages added to order :)");
                                secondDishesInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                secondDishesInput = "0";
                                break;
                        }

                    }
                    break;
                case "4":
                    System.out.println("Beverages");
                    System.out.println("1 ->" +menuBeverages.cocaCola + " " + menuBeverages.priceCoca + "€");
                    System.out.println("2 ->" +menuBeverages.sprite + " " + menuBeverages.priceSprite + "€");
                    System.out.println("3 ->" +menuBeverages.sevenUp + " " + menuBeverages.priceSevenUp + "€");
                    System.out.println("4 ->" +menuBeverages.sparklingWater + " " + menuBeverages.priceSparklingWater + "€");
                    System.out.println("5 ->" +menuBeverages.stillWater + " " + menuBeverages.priceStillWater + "€");
                    System.out.println("finish -> Exit");
                    System.out.println();
                    System.out.println("Insert the number referred to the option you like");
                    String beveragesInput = scanner.nextLine();
                        while (!Objects.equals(beveragesInput, "0")){

                        switch (String.valueOf(beveragesInput)){

                            case "1":
                                order.add(menuBeverages.cocaCola);
                                System.out.println("Your order now is : " + order);
                                beveragesInput = "0";
                                break;
                            case "2" :
                                order.add(menuBeverages.sprite);
                                System.out.println("Your order now is : " + order);
                                beveragesInput = "0";
                                break;
                            case "3":
                                order.add(menuBeverages.sevenUp);
                                System.out.println("Your order now is : " + order);
                                beveragesInput = "0";
                                break;
                            case "4" :
                                order.add(menuBeverages.sparklingWater);
                                System.out.println("Your order now is : " + order);
                                beveragesInput = "0";
                                break;
                            case "5":
                                order.add(menuBeverages.stillWater);
                                System.out.println("Your order now is : " + order);
                                beveragesInput = "0";
                                break;
                            case "end":
                                System.out.println("Beverages added to order :)");
                                beveragesInput = "0";
                                printMenu();
                                input = scanner.nextInt();
                                break;
                            default:
                                System.out.println();
                                beveragesInput = "0";
                                break;
                            }
                            System.out.println("Your order now is : " + order);
                        }
                    break;
                case "5":
                    System.out.println("Dessert");

                case "finish":
                    System.out.println("Thanks for your order");

                default:
                    System.out.println("The number is invalid");
                    break;
            }
        }
        System.out.println("You have finished your order");
}
}