import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DataStructure
{
    public static void arr_test()
    {
        List<Integer> arr1 = new ArrayList<Integer>();

        // append value
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        // change value
        arr1.set(1, 10);

        // pop value
        System.out.println(arr1.remove(arr1.size() - 1));

        System.out.println(arr1.get(0));
        System.out.println(arr1);
    }

    public static void map_test()
    {
        HashMap<String, Integer> dict1 = new HashMap<>();

        // insert key/value
        dict1.put("apple", 5);
        dict1.put("banana", 2000);
        dict1.put("cherry", 1400);

        // key check
        System.out.println(dict1.containsKey(("banana")));


        System.out.println(dict1.get("apple"));

        dict1.remove("apple");
        System.out.println(dict1);
    }

    public static void forif()
    {
        List<Integer> arr2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(arr2);
        for (int i=0; i<arr2.size(); i++)
        {
            if (arr2.get(i)==3)
            {
                continue;
            }
            else if (arr2.get(i)>6)
            {
                break;
            }
            System.out.println(arr2.get(i));
        }

        // string for
        String str = "hello";
        for (int j=0; j<str.length(); j++)
        {
            System.out.println(str.charAt(j));
        }
    }

    public static void main(String[] args)
    {
        System.out.println("----- arr test -----");
        arr_test();

        System.out.println("----- map(dict) test -----");
        map_test();

        System.out.println("----- for/if test -----");
        forif();
    }
}
