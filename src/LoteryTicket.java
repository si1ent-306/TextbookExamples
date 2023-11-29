import java.util.Arrays;

public class LoteryTicket {
    public static void main(String[] args){
        int[][] lotteryCard = new int[6][6];
        for(int i = 0; i < lotteryCard.length; i++){
            for(int j = 0; j < lotteryCard[i].length; j++){
                lotteryCard[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(lotteryCard));
    }
}
