const lengthOflongestSubstring = (s)=>{
    let right = 0;
    let left = 0;
    let maxLen = 0;
    const map = new Map();
    while(right<s.length){
        if(map.has(s.charAt(right)))
            left = Math.max(left,map.get(s.charAt(right))+1);
        map.set(s.charAt(right),right);
        maxLen = Math.max(maxLen,right-left+1)
        right++;
    }
    return maxLen
}

ans = lengthOflongestSubstring("abcabc");
console.log(ans)