/**
 * @param {number[][]} nums
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(nums, r, c) {
 	if(nums.length * nums[0].length != r * c) return nums;

	var result = [];
	for(var i = 0; i < r; i++) result[i] = [];
	var x = 0; y = 0;

	for(var m = 0; m < nums.length; m++)
		for(var n =0; n < nums[0].length; n++) {
			result[x][y] = nums[m][n];
			y++;
			if(y>=c) {x++;y=0}
		}   

	return result;
};

console.log(matrixReshape([[1,2],[3,4]],1,4));
console.log(matrixReshape([[1,2],[3,4]],2,4));
console.log(matrixReshape([[1]],1,1));
