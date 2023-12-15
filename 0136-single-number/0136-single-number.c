int singleNumber(int* nums, int numsSize){

    int i,j,track;

    for(i=0;i<numsSize;i++){
        track=0;
        for(j=0; j<numsSize;j++){
            if(nums[i]==nums[j] && j!=i){
                track++;  
            }
        }
        if(track==0){
            return nums[i];
        }
    }
    return -1;
}