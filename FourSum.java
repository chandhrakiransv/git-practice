import java.util.*;

class FourSum{
    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {

                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {

                            List<Integer> quad =
                                    Arrays.asList(nums[i], nums[j], nums[k], nums[l]);

                            Collections.sort(quad);

                            set.add(quad);
                        }
                    }
                }
            }
        }

        System.out.println(set);
    }
}