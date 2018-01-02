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
public class logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        if (small * 1 + big * 5 >= goal && (small + big * 5 - goal) % 5 == 0 | (small + big * 5 - goal) <= small) {
            return true;
        }
        if (small * 1 == goal) {
            return true;
        }
        if (big * 5 == goal) {
            return true;
        }
        if ((goal % 5) <= small && big >= (goal - goal % 5) / 5) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        if (a == b && b != c) {
            return c;
        }
        if (b == c && b != a) {
            return a;
        }
        if (a == c && b != c) {
            return b;
        } else {
            return 0;
        }
    }
    
    
    public int luckySum(int a, int b, int c) {
        if (a != 13 && b != 13 && c != 13) {
            return a + b + c;
        }
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else {
            return 0;
        }
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        } else {
            return n;
        }
    }

    public int roundSum(int a, int b, int c) {
  
  

    public int round10(int num) {
        if (num % 10 < 5) {
            num = num - num % 10;
        } else if (num % 10 >= 5) {
            num = ((num - num % 10) / 10 + 1) * 10;
        }
        return num;
    }

    int sum = round10(a) + round10(b) + round10(c);
    return sum ;

}
    public boolean closeFar(int a, int b, int c) {
  if (Math.abs(b-a)<=1&&Math.abs(c-a)>=2&&Math.abs(c-b)>=2||Math.abs(c-a)<=1&&Math.abs(b-a)>=2&&Math.abs(c-b)>=2){
    return true;
  }
  else
    return false;
}

public int blackjack(int a, int b) {
  if (a<=21&&b<=21){
    if (Math.abs(a-21)<=Math.abs(b-21)){
      return a;
    }
    else 
      return b;
  }
  if (a<=21&&b>21){
    return a;
  }
  if (b<=21&&a>21){
    return b;
  }
  else
     return 0;
}


}
