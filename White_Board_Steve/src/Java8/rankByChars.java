package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Returns a ranked list of chars by most appearance when given a string

class charData implements Comparable<charData> {
    private char name;
    private int frequency;

    public charData(char Name, int Frequency) {
        name= Name;
        frequency= Frequency;
    }

    public char getName() {
        return name;
    }

    public int getFreq() {
        return frequency;
    }

    @Override
    public int hashCode() {
        final int prime= 31;
        int result= 1;
        result= prime * result + name;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        charData other= (charData) obj;
        if (name != other.name) return false;
        return true;
    }

    @Override
    public int compareTo(charData letter) {
        int other_freq= letter.frequency;
        if (frequency > other_freq) {
            return -1;
        } else if (frequency < other_freq) {
            return 1;
        } else {
            return name == letter.name ? 1 : 0;
        }
    }

    public void addFrequency() {
        frequency+= 1;
    }

    @Override
    public String toString() {
        return name + ", " + frequency;
    }

}

public class rankByChars {

    public static void main(String[] args) {
        // Approach 1
        // comparator implementation
        String test= "aabbcccdddd";
        
        System.out.println(findFreq(2, test));
         

    }

    // find frequency given the rank from greatest to least of a char
    // ex findFreq("aaaabbbcc",3) should generate 2.

    public static char findFreq(int rank, String text) {
        boolean newChar= true;
        List<charData> charRankings= new ArrayList<>();
        for (char letter : text.toCharArray()) {
            newChar= true;
            for (charData data : charRankings) {
                if (data.getName() == letter) {
                    data.addFrequency();
                    newChar= false;
                }
            }
            if (newChar) {
                charRankings.add(new charData(letter, 1));
            }
        }
        Collections.sort(charRankings);

        int index= 0;
        int prevFreq= 0;

        for (charData data : charRankings) {
            if (data.getFreq() != prevFreq) {
                index+= 1;
            }
            if (index == rank) { return data.getName(); }
            prevFreq= data.getFreq();
        }

        return ' ';
    }

}

