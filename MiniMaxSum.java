    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long totalMin=0;
        long totalMax=0;
        
        for (int i = 0; i <arr.size()-1; i++) {
            totalMin+=arr.get(i);
        }
        for (int i = 1; i <arr.size(); i++) {
            totalMax+=arr.get(i);
        }
        System.out.println(totalMin +" " + totalMax);
    }