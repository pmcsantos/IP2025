void main(String args[]) {
    //String phrase = "lonjdsfnjfsf";
    //IO.println(phrase.length());
    //IO.println(countLines("jasdnsd\ndakskmdkamk\nsdlasd\snjjnsdj\tjasdja\njadjjn\n"));
    //int[] nums = {1,3,5,6,7,2};
    //IO.println(toText(nums, " "));


}
static boolean isInt(String s) {
    if(s.isEmpty()) {
        return false;
    }
    char[] array = s.toCharArray();
    for (int i=0;i<array.length;i++) {
        if (!Character.isDigit(array[i])) {
            return false;
        }
    }
    return true;
}

static int toInt(String s) {
    assert isInt(s);
    return Integer.valueOf(s);
}

static int countWord(String[] words, String find) {
    int count = 0;
    for (String s : words) {
        if (s.equals(find)) {
            count++;
        }
    }
    return count;
}

static String longestWord(String[] words) {
    assert words.length>0;
    String longest = words[0];
    for (int i=0;i<words.length;i++) {
        if (words[i].length()>longest.length()){
            longest = words[i];
        }
    }
    return longest;
}

static int countLines(String s) {
    if (s.isEmpty()) {
        return 0;
    }
    int count = 1;
    for (int i=0;i<s.length();i++) {
        if (s.charAt(i) == '\n'){
            count++;
        }
    }
    return count;
}

String toText(int[] array, String separator) {
    String s = "";
    for (int i=0;i<array.length - 1;i++) {
        s += array[i] + separator;
    }
    return s + array[array.length-1];
}

