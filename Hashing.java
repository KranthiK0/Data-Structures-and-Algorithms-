//class tUf {
//    // no of elements
//    // array input
//    // testcase
//    // freq of element to find
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        int n;
////        n = sc.nextInt();
////        int[] arr = new int[n];
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
////
//////precompute:
////
////        int[] hash = new int[13];
////        for (int i = 0; i < n; i++) {
////            hash[arr[i]] += 1;
////        }
////
////        int q;
////        q = sc.nextInt();
////        while (q-- != 0) {
////            int number;
////            number = sc.nextInt();
////// fetching:
////            System.out.println(hash[number]);
//
//
//            String s;
//            s = sc.next();
//
//            //precompute:
////            int[] hash = new int[26];
////            for (int i = 0; i < s.length(); i++) {
////                hash[s.charAt(i) - 'a']++;
////            }
//
////            int q;
////            q = sc.nextInt();
////            while (q-- > 0) {
////                char c;
////                c = sc.next().charAt(0);
////                // fetch:
////                System.out.println(hash[c - 'a']);
//
////                int[] hash = new int[256];
////                for (int i = 0; i < s.length(); i++) {
////                    hash[s.charAt(i)]++;
////                }
////        int q;
////        q = sc.nextInt();
////        while (q-- > 0) {
////            char c;
////            c = sc.next().charAt(0);
////            // fetch:
////            System.out.println(hash[c]);
////      }
//
//
//
//    }
//}
//class tUf {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //precompute:
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int key = arr[i];
//            int freq = 0;
//            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
//            freq++;
//            mp.put(key, freq); // inserting into the map
//        }
//
//        // Iterate over the map:
//        /*
//        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
//            System.out.println(it.getKey() + "->" + it.getValue());
//        }
//        */
//
//        int q;
//        q = sc.nextInt();
//        while (q-- > 0) {
//            int number;
//            number = sc.nextInt();
//            // fetch:
//            if (mp.containsKey(number)) System.out.println(mp.get(number));
//            else System.out.println(0);
//        }
//    }
//}
