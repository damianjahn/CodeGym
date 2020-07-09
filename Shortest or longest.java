/* Shortest or longest
Java games with lists are very popular. 
This makes sense, since they are all so simple and interesting. Join in the fun! 
In this task, we create a list of strings. Then we add 10 strings from the keyboard. 
The most interesting part is that we'll determine whether the shortest string or the longest string is encountered first in the list. 
If more than one string is shortest or longest, we'll consider the very first one we encounter. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        
        boolean flag = true;
        int x =0;
        for (int i = 0; i < 10 ; i++) {
            list.add(buffer.readLine());
        }
        
        String shortest = list.get(0);
        String longest = list.get(0);
        for(int i=0;i<list.size();i++) {
        	if(shortest.length() > list.get(i).length()) {
        		shortest = list.get(i);
        		flag = false;
        	}
        	if(longest.length() < list.get(i).length()) {
        		longest = list.get(i);
        		flag = true;
        	}
        }
        	if(flag) {
        		System.out.println(shortest);
        	} else {
        		System.out.println(longest);
        }
    }
}
