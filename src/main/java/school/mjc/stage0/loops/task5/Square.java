package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i ==0 || i == length-1) {
                    System.out.print("8");
                    continue;
                }

                if(j == 0 || j == length-1) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
