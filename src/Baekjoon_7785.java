import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_7785
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String situation = st.nextToken();

            if (situation.equals("enter"))
            {
                map.put(name, situation);
            }
            else {
                map.remove(name);
            }
        }

        ArrayList<String> arr1 = new ArrayList<>(map.keySet());
        Collections.sort(arr1, Collections.reverseOrder());
        for (String s : arr1)
        {
            System.out.println(s);
        }
    }
}
