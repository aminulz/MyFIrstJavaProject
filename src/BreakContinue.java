public class BreakContinue {
    public static void main(String[] args) {
//        Break command in for loop

//        for(int print1to5 = 1; print1to5 <= 5; print1to5++){
//            if(print1to5 == 2){
//                continue;
//            }
//            else {
//                System.out.println(print1to5);
//            }
//        }

//        Break command in While loop
        int whilePrint = 1;
//        while (whilePrint <= 5)
//            if (whilePrint == 2) {
//                whilePrint++;
//                continue;
//            } else {
//                System.out.println(whilePrint);
//                whilePrint++;
//            }
//       Break command in Do while loop
        outer: do{
            if(whilePrint == 2){
                whilePrint++;
                break outer;
            }
            else {
                System.out.println(whilePrint);
                whilePrint++;
            }
        } while (whilePrint <= 5);
    }
}
