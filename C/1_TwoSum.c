/*
Given an array of integers 'nums' and an integer 'target',
return indices of the two numbers such that they add up
to target.
You may assume that each input would have exactly one
solution, and you may not use the same element twice.
You can return the answer in any order.
*/
#include <stdio.h>
int main()
{
    int nums[] = {1, 2, 3, 4};
    int target;
    printf("Whats the target:");
    scanf("%d",&target);
    int target_existed;
    for (int i = 0; i < 4; i++)
    {
        for (int j = i+1; j < 4; j++)
        {
            if (nums[i] + nums [j] == target)
            {
                printf("index : [%d,%d]",i,j); // returned indices of the numbers that add up to target
                target_existed = 1;
                break;
            }
        }
    }
    if (target_existed != 1)
    {
        printf("Numbers did not add upto target\n");
    }
    
    
    return 0;
}