function hurdleRace(k, height) {
    let temp =height[0];
    for(let i =1;i<height.length;i++){
        if(height[i]>temp){
            temp=height[i];
        }
    }
    if(temp>k){
        return temp-k;
    }
    else
        return 0;
}
