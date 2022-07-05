func bonAppetit(bill []int32, k int32, b int32) {
	var total int32 = 0
	var temp int32 = 0
	var last int32
	for i := 0; i < len(bill); i++ {
		total += bill[i]
	}
	temp = (total - bill[k]) / 2

	if temp < b {
		last = b - temp
		fmt.Println(last)
	}
	if temp >= b {
		fmt.Println("Bon Appetit")
	}
}
