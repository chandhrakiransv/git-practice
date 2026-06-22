import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram{
    public static void main(String arg[]){
        String s1="silent";
        String s2="listen";
        // char[] a = s1.toCharArray();
        // char[] b = s2.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // System.out.println(Arrays.equals(a, b));



        // String sorted1 = s1.chars()
        //         .sorted()
        //         .mapToObj(c -> String.valueOf((char)c))
        //         .collect(Collectors.joining());

        // String sorted2 = s2.chars()
        //         .sorted()
        //         .mapToObj(c -> String.valueOf((char)c))
        //         .collect(Collectors.joining());

        // System.out.println(sorted1.equals(sorted2));


        // int[] arr1 = new int[26];
        // int[] arr2 = new int[26];
        // for(char ch : s1.toCharArray()) {
        //     arr1[ch - 'a']++;
        // }
        // for(char ch : s2.toCharArray()) {
        //     arr2[ch - 'a']++;
        // }
        // boolean isAnagram = true;
        // for(int i = 0; i < 26; i++) {
        //     if(arr1[i] != arr2[i]) {
        //         isAnagram = false;
        //         break;
        //     }
        // }
        // System.out.println(isAnagram);


         if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);
    }
}