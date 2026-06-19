
import java.util.*;
class Stream{
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
        int result = ls.stream()
        .reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        System.out.println("Min:"+result);
    }

}