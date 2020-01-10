
/**
 * Write a description of class HW108 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class HW108
{
    private static ArrayList<String> testList = new ArrayList<String>(Arrays.asList("alex", "brian", "charles", "koren"));
    private static String[] testArray = {"alex", "brian", "charles", "koren"};
    
    public static ArrayList<String> reverseArr(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            newList.add(0,list.get(i));
        }
        return newList;
    }
    public static String[] reverseArr(String[] list) {
        String[] newList = new String[list.length];
        for(int i = 0; i < list.length; i++){
            newList[list.length-i-1] = list[i]; 
        }
        return newList;
    }
    public static void print(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {System.out.print(list.get(i) + " ");}
    }
    public static void print(String[] list) {
        for(int i = 0; i < list.length; i++) {System.out.print(list[i] + " ");}
    }
    public static void print(String string){System.out.print(string);}
    public static void runTest() {
        print(testList);
        System.out.println("");
        print(reverseArr(testList));
        System.out.println("");
        print(reverseArr(testArray));
    }
}
