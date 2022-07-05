public static List<Integer> gradingStudents(List<Integer> grades) {
        int value;
        for (int i = 0; i <grades.size();i++) {
            value=0;
            if(grades.get(i)>40 && grades.get(i) % 5!=0){
                if((5- (grades.get(i) % 5))<3){
                    value = grades.get(i) +(5- (grades.get(i) % 5));
                    grades.set(i,value);
                }
            }
            if(grades.get(i)<40 && grades.get(i)>35 && grades.get(i) % 5!=0){
                if((5- (grades.get(i) % 5))<3){
                    value = grades.get(i) +(5- (grades.get(i) % 5));
                    grades.set(i,value);
                }
            }
        }
        return grades;
}
