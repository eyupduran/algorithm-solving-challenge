 public static int birthdayCakeCandles(List<Integer> candles) {
    int max=candles.get(0);
        for(int i=1;i<candles.size();i++){
         if(max<candles.get(i)){
             max=candles.get(i);
         }   
        }
        int nb = 0;
        for(int j=0;j<candles.size();j++){
            if(candles.get(j)==max){
                nb++;
            }
        }
        return nb;
    }