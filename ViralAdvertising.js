function viralAdvertising(n) {
    let likedCounter =0
    let sharedCounter =5
    let index =1
    let divResult
    while(index <=n){
        divResult = Math.floor(sharedCounter/2)
        sharedCounter =divResult*3
        likedCounter += divResult
        index++
    }
    return likedCounter
}
console.log(viralAdvertising(3))
