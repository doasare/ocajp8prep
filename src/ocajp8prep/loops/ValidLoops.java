package ocajp8prep.loops;

public class ValidLoops {
    public static void main(String [] args){
        int x = 3;
//        while(false){} // results in unreachable block
        if (false){ x = 3; }
        do{ x = 3; } while (false);
        for (;;){ x = 3; }
    }
}
