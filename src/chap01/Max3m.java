package chap01;

// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다. 

class Max3m {
	// a,b,c의 최댓값을 구하여 반환합니다. 
	static int max3(int a, int b, int c) {
		int max = a; // 최댓값
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max; 
		// 구한 최댓값을 호출한 곳으로 반환
	}

}
