var findMedianSortedArrays = function(nums1, nums2) {
    nums1 = [...nums1,...nums2]
    nums1.sort((a,b)=>a-b)
    let len = nums1.length
    if(len%2!=0){
        return nums1[Math.trunc(len/2)]
    }else {
        return (nums1[len/2]+nums1[len/2-1])/2
    }

};

const array1 = [1,3];
const array2 = [2];

console.log(findMedianSortedArrays(array1,array2))