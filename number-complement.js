/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
 	var result = 0;
	var exp = 1;
	while(num > 0) {
		if((num & 0x01) === 0) { result += exp; }
		exp = exp << 1;
		num = num >> 1;
	}
	return result;
};

console.log(findComplement(5));
console.log(findComplement(1));

