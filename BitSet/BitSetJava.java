import java.util.BitSet;

public class BitSetJava{
    public static void main(String[] args){
        // Creating new bitset
        BitSet bSet1 = new BitSet();
        BitSet bSet2 = new BitSet();
        long[] arr = {127};
        // setting the bits while converting a long's dec to binary
        bSet1 = BitSet.valueOf(arr);
        System.out.println(bSet1);
        // size of data structure (Note Bitset is auto resizable)
        System.out.println(bSet1.size());
        // setting a bit position to true (by default false)
        bSet2.set(144);
        bSet2.set(61);
        System.out.println(bSet2);
        // length of max bit true (+1)
        System.out.println("length: " + bSet2.length());
        // getting bit value of position (true/false)
        System.out.println(bSet2.get(128));
        bSet2.clear(144);
        System.out.println(bSet2);
        bSet2.clear();
        System.out.println(bSet2);
        bSet1.clear();
        bSet2.clear();
        bSet1.set(1);
        bSet2.set(2);
        // or operation between two bitset
        bSet1.or(bSet2);
        System.out.println("or: " + bSet1);
        bSet1.clear();
        bSet2.clear();
        bSet1.set(1);
        bSet2.set(2);
        // and operation
        bSet1.and(bSet2);
        System.out.println("and: " + bSet1);
    }
}