public class Maximum_Cont_subarr{
    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            suffix *= nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(prefix, suffix));
            if (prefix == 0)
                prefix = 1;

            if (suffix == 0)
                suffix = 1;
        }

        System.out.println(max);
    }
}