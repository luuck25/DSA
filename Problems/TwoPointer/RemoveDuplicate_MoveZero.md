

public static int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[j] != nums[i]) {
            nums[++j] = nums[i];
        }
    }
    return ++j;
}


public static void moveZeroes(int[] nums) {
    int j = 0;
    // If first element is non-zero, place it at j and move j forward
    if (nums[0] != 0) {
        nums[j++] = nums[0];
    }

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[j++] = nums[i];
        }
    }

    // Fill the remaining with zeros
    while (j < nums.length) {
        nums[j++] = 0;
    }
}



<img width="866" alt="image" src="https://github.com/user-attachments/assets/4dd81184-b97e-4775-8deb-fa093a47fe04" />
