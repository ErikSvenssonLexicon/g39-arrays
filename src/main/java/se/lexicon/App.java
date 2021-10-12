package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    }

    public static void arrayConcatExample(){
        String[] source = {"Foo", "Bar", "Baz"};
        String[] toAdd = {"Boo", "Baa"};

        String[] result = addToStringArray(source, toAdd);
        System.out.println(arrayToString(result));
    }

    public static void dynamicArrayExample(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String[] todos = {};
        while(running){
            System.out.print("Write a task: ");
            String task = scanner.nextLine();
            todos = addToStringArray(todos, task);
            System.out.println(arrayToString(todos));
            System.out.println("Do you want to continue? (y / n)");
            switch (scanner.nextLine()){
                case "n":
                    running = false;
                    break;
            }
        }
    }

    public static void nullExample(){
        String[] tasks = {"Buy diapers"};
        String task = findTask("Cook dinner", tasks);
        if(task == null){
            System.out.println("Could not find the task you were looking for");
        }else {
            System.out.println(task);
        }
    }

    public static String[] addToStringArray(final String[] source, String...strings){
         String[] newArray = Arrays.copyOf(source, source.length + strings.length);
        for(int iWrite = source.length, iRead = 0; iRead<strings.length; iWrite++, iRead++){
            newArray[iWrite] = strings[iRead];
        }
        return newArray;
    }

    public static String[] addToStringArray(final String[] source,final String string){
        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length -1] = string;
        return newArray;
    }

    public static String findTask(String task, String[] array){
        String[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        int index = Arrays.binarySearch(temp, task);
        if(index < 0){
            return null;
        }
        return temp[index];
    }

    public static String preferredFindTask(String task, String[] array){
        for(String string : array){
            if(task.equals(string)){
                return task;
            }
        }
        return null;
    }

    public static String arrayToString(String[] strings){
        String message = "[";
        for(int i=0;i<strings.length; i++){
            message = message + strings[i];
            if(i != strings.length -1){
                message = message + ", ";
            }
        }
        message += "]";
        return message;
    }
}
