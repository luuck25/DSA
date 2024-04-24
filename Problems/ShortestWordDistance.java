package Java.Problems;

public class ShortestWordDistance {

    public static void main(String[] args) {
        int j=distance(new String[]{"coding","ninjas","help","to","crack","product","based","companes"},"coding","product");
        System.out.println(j);

    }

    public static int distance(String[] arr,String str1,String str2) {
      int a = -1,b=-1;
      int min = Integer.MAX_VALUE;
     for(int i=0; i<arr.length; i++)
     {
         if(arr[i].equals(str1)) a= i;
         else if (arr[i].equals(str2)) b= i;
        if(a!=-1 && b!=-1) min= Math.min(min,Math.abs(a-b));
     }
    return min;
    }

}