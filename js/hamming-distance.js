/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
	var result = x ^ y;
	var distance = 0;
	while(result > 0) {
		if((result & 0x01) === 1)  distance ++;
		result = result >> 1;
	}
	return distance;
};

console.log(hammingDistance(1,4));
console.log(hammingDistance(0,4));
console.log(hammingDistance(4,4));
