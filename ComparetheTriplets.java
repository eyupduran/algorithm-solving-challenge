public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> returned=new ArrayList<>();
        int pa=0;
        int pb=0;
        for (int i =0;i<a.size();i++){
              if(a.get(i)<b.get(i)){
                pb+=1;
            }
            else if (a.get(i)>b.get(i)){
                pa+=1;
            }
        }
        returned.add(0,pa);
        returned.add(1,pb);
        return returned;
    }