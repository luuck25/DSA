public static int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[j] != nums[i]) {
            nums[++j] = nums[i];
        }
    }
    return ++j;
}






<img width="866" alt="image" src="https://github.com/user-attachments/assets/4dd81184-b97e-4775-8deb-fa093a47fe04" />
