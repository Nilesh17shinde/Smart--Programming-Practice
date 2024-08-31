package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;
/*
Q1- Select only Passed Student
Q2- Add the 10 gress marks to all the failed Student
 */
public class PassedStudent {
    public static void main(String args[]){
        List<Integer> marks= Arrays.asList(35,30,60,75,25,19,99);
        List<Integer> passedStudent=marks.stream()
                .filter(i->i>35)
                .toList();

        System.out.println(passedStudent);

        List<Integer>gressMarks=marks.stream()
                .filter(i->i<35)
                .map(i->i+10)
                .toList();
        System.out.println(gressMarks);
    }
}
