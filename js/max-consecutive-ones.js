/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
 	var index = -1;
	var max = 0;
	var len;
	for(var i = 0; i < nums.length; i++){
		if(nums[i] === 0) {
			len = i - index - 1;
			if(len > max) max = len;
			index = i;
		}
	}

	len = nums.length - index - 1;
	if(len > max) max = len;
	  
	return max; 
};

console.log(findMaxConsecutiveOnes([1,1,0,1,1,1])); //3
console.log(findMaxConsecutiveOnes([])); //3
console.log(findMaxConsecutiveOnes([1,1])); //2
console.log(findMaxConsecutiveOnes([1,1,0,1,1,1,0])); //3
