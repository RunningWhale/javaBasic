import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class 奖学金 {
    static class Score implements Comparable<Score> {
        public int score;
        public int need;

        @Override
        public int hashCode() {
            return Objects.hash(score, need);
        }

        public Score(int score, int need) {
            this.score = score;
            this.need = need;
        }

        @Override
        public int compareTo(Score o) {
            return this.need - o.need;
        }

        @Override
        public String toString() {
            return "Score{" +
                    "score=" + score +
                    ", need=" + need +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s = s1.split(" ");
        int n = Integer.valueOf(s[0]);//课程总数
        int r = Integer.valueOf(s[1]);//满分
        int avg = Integer.valueOf(s[2]);//平均分
        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++) {
            String s11 = sc.nextLine();
            String[] s2 = s11.split(" ");
            Score score = new Score(Integer.valueOf(s2[0]), Integer.valueOf(s2[1]));
            scores[i] = score;
        }
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        int avgSum = avg * n;
        int now = 0;
        for (int i = 0; i < n; i++) {
            now += scores[i].score;
        }
        int needScore = avgSum - now;
        int needTime = 0;
        for (int i = 0; i < n; i++) {
            while (scores[i].score < r && needScore > 0) {
                needScore--;
                needTime += scores[i].need;
                scores[i].score++;
            }
        }
        System.out.println(needTime);
    }
}
