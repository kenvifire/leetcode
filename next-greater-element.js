/**
 * @param {number[]} findNums
 * @param {number[]} nums
 * @return {number[]}
 */
var nextGreaterElement = function(findNums, nums) {
	var map = new Object();
	for(var i = 0; i < nums.length; i++) {
		map[nums[i]] = i;
	}

	var result = [];
	
	for(var i = 0; i < findNums.length; i++) {
		var value = findNums[i];
		var index = map[findNums[i]];
		var nextGreater = -1;
		while(index < nums.length) {
			if(nums[index] > value) { nextGreater = nums[index]; break;}
			index++;
		}

		result.push(nextGreater);

	}

	return result;
};

console.log(nextGreaterElement([4,1,2],[1,3,4,2]));
console.log(nextGreaterElement([2,4],[1,2,3,4]));
console.log(nextGreaterElement([1,3,5,2,4],[6,5,4,3,2,1,7]));

