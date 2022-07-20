function angryProfessor(k, a) {
    let count=0
    a.forEach(element => {
        if(element<=0){
            count++
        }
    });
    return (k>count) ?  "YES" : "NO"

}
