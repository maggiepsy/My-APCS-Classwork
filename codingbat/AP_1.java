/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author MaggiePu
 */
public class AP_1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= scores[i + 1]) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public boolean scores100(int[] scores) {
        if (scores.length >= 2) {
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == 100 && i != scores.length - 1) {
                    if (scores[i + 1] == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i + 2] - scores[i]) <= 2) {
                return true;
            }
        }
        return false;
    }
    
    public int scoresAverage(int[] scores) {

        int average1 = average(int[]scores, 0, scores.length / 2
        );
  int average2 = average(int[]scores, scores.length / 2, scores.length - 1
        );
  
  if (average1 > average2) {
            return average1;
        } else {
            return average2;
        }

    }

    public int average(int[] scores, int start, int end) {
        for (int i = start; i < end; i++) {
            int sum = scores[i] +;
        }
        int average = sum / (end - start);
        return average;
    }


}
