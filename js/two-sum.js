/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
function pair(key, value) {
	this.key = key
	this.value = value
}

function binarySearch(ar, el, compare_fn) {
	var m = 0;
	var n = ar.length - 1;
	while (m <= n) {
		var k = (n +m) >> 1;
		var cmp = compare_fn(el,ar[k].value);
		if(cmp > 0){
			m = k + 1;
		} else if(cmp < 0){
			n = k-1;
		}else {
			return k;
		}
	}
	return -m-1;
}

var twoSum = function(nums, target) {
	var map = new Object();
	var list = [];
	var result = [];
	for (var i = 0; i < nums.length; i++) {
		map[i] = target - nums[i];
		var p = new pair(i, nums[i]);
		list.push(p)
	}	
	list.sort(function (a,b) {
		return a.value - b.value;
	})
	
	
	for (var i = 0; i < nums.length; i++) {
		var index = binarySearch(list, map[i], function (a,b) {
				return a - b;
			});
//		console.log(index + "=>search " + map[i] + " in " + dumpList(list));
		if(index >= 0 && i !=list[index].key) {
			
			return i < list[index].key ? [i,list[index].key] : [list[index].key,i];
		}
			
		
	}
	
};

function dumpList(list) {
	for (var i = 0; i < list.length; i++) {
		console.log(list[i])
	}
}

console.log(twoSum([2, 7, 11, 15], 9))
console.log(twoSum([2, 11, 7, 15], 9))
console.log(twoSum([2, 1, 3], 4))
console.log(twoSum([1,1], 2))




