function utopianTree(n) {
    let elem = 1
        for(let i=1;i<=n;i++){
            if(i % 2===0){
                elem++
            }
            else
                elem=elem*2
        }
        return elem
}
