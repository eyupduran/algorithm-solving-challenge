function beautifulDays(i, j, k) {
    let count =0;
    let reverseNumber,diffAndDiv
    for(let number=i;number<=j;number++){
        reverseNumber,diffAndDiv =0
        reverseNumber = Number(String(Math.abs(number)).split('').reverse().join(''));
        diffAndDiv = Math.abs((number-reverseNumber))/k
        if(Number.isInteger(diffAndDiv)){
            count++
        }
    }
    return count
}
