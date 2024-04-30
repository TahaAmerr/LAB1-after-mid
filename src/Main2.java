import java.util.*;


public class Main2 {
    public static void main(String[] args) {
        String text = "Sure! Let's delve into the fascinating world of cognitive biases. Our minds are marvelous yet flawed instruments, susceptible to a myriad of cognitive biases that often lead us astray without our conscious awareness. Take the confirmation bias, for instance, where we tend to seek out information that confirms our preexisting beliefs while dismissing or ignoring evidence that contradicts them. This bias not only distorts our perception of reality but also hampers our ability to make objective decisions. Similarly, the availability heuristic tricks us into overestimating the likelihood of events based on how readily we can recall similar instances from memory, leading to skewed judgments and poor risk assessment. By understanding these biases, we can strive to mitigate their influence, fostering a more rational and informed approach to decision-making.";

        ArrayList<String> list = new ArrayList<>();

        list.addAll(List.of(text.split(" ")));

        for (String a : list)
            System.out.println(a);

        System.out.println("TOTAL WORDS");
        System.out.println(list.size());

        Set<String> set1 = new HashSet<>();
        set1.addAll(list);

        System.out.println("UNIQUE WORDS");
        System.out.println(set1.size());

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(List.of(text.split("\\.")));

        System.out.println("TOTAL SENTENCES");
        System.out.println(list2.size());

        System.out.println("TOTAL CHARACTERS");
        char list5[] = text.toCharArray();
        System.out.println(list5.length);

        System.out.println("UNIQUE CHARACTERS");
        Set<Character> list6 = new HashSet<>();
        for (char a : list5)
            list6.add(a);

        System.out.println(list6.size());

    }
}
