package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintWithoutDuplicaet 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size=sc.nextInt();
    String []arr=new String[size];
    System.out.println("Enter the elements of array:");
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.next();
    }
    
    LinkedHashSet<String> duplicate=new LinkedHashSet<>();
     LinkedHashSet<String> unique=new LinkedHashSet<>();
     for(int i=0;i<arr.length;i++)
     {
        if(!duplicate.add(arr[i]))
        {   
            unique.add(arr[i]);
        }
     }

    System.out.println("Array without duplicates: " + duplicate);
    System.out.println("Duplicate elements: " + unique);
}
}
