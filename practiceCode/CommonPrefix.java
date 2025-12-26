public class CommonPrefix {

  public static String commonPrefix(String [] strs){
    boolean isSame =true;
    String prefix ="";
    int j = 0;
    while (isSame) {
    for (int i = 0; i < strs.length; i++) {
        System.out.println(strs[i].charAt(j));
      prefix =String.valueOf(strs[i].charAt(j));
    }
    j++;

    }
    return prefix;
  }
  public static void main(String[] args) {
    String strs[] = {"Flower","Flow","Flaw"};
    commonPrefix(strs);
    String flower ="flower";
  }
}
