function saveThePrisoner(n, m, s) {
    let r = m % n;
         if ((r + s - 1) % n == 0) {
             return n;
         } else {
             return ((r + s - 1) % n);
         }
 }

 