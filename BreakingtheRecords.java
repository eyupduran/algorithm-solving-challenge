public static List<Integer> breakingRecords(List<Integer> scores) {
     int highScore=scores.get(0);
        int lowScore=scores.get(0);
        int highCount=0;
        int lowCount=0;
        
        List<Integer> a=new ArrayList<>();
        
        for (int i = 1; i <scores.size() ; i++) {
            if(scores.get(i)>highScore){
                highScore=scores.get(i);
                highCount++;
            }
            if(scores.get(i)<lowScore){
                lowScore=scores.get(i);
                lowCount++;
            }
        }
        a.add(highCount);
        a.add(lowCount);
        return a;
    }