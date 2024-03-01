package string2;

public class GetSandwich {
  public String getSandwich(String str) {
    int first = str.indexOf("bread");
    int last = str.lastIndexOf("bread");

    if (first != last) {
      return str.substring(first + 5, last);
    }
    return "";
  }

}
