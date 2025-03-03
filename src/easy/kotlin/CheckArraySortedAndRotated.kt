package easy.kotlin

class CheckArraySortedAndRotated {
    // array sort and print it
    fun check(nums: IntArray):Boolean{
        var ishigh:Int = 0;
        val i:Int = 0;
        for( i in nums.indices){
            if(nums[i] > nums[(i+1)%nums.size] && ++ishigh>1){
                return false;
            }
        }
        return true;
    }

}