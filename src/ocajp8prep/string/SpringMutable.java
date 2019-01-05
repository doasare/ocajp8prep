package ocajp8prep.string;

public class SpringMutable {
    // different between
    public static void main(String [] args){
        StringBuffer sbf = new StringBuffer("Welcome to my ");

        sbf.append("World");
        sbf.replace(14,19, "Home"); // begin on number to change and just beefore end

        System.out.println(sbf);

    }
}
