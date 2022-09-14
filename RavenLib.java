public class RavenLib {
    /* Staring steps creating my own library :) */
    static void reverseArray(int[] array) {                 //reverse same array
        int start = 0;
        int end = array.length-1;
        int temp;
        while(start<end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    static int[] newReversedArray(int[] array) {            //reverse and return new array
        int start = 0;
        int end = array.length-1;
        int temp;
        while(start<end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    static String reverseString(String string){             //reverse and return new string
        StringBuilder sb = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
    static int maxInArray(int[] array){
        int max = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    static int minInArray(int[] array){
        int min = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args){
        System.out.println("");
        int[] arr = {1,555,2,-55,6,555,5,6,5,88,9775,2};
        System.out.println(minInArray(arr));
    }
}
