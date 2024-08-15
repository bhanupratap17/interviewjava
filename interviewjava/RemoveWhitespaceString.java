package interviewjava;

public class RemoveWhitespaceString {

    static  String removeWhiteSpaces(String str)
    {
        String resultStr = "";
        for(char c : str.toCharArray())
        {
            if(!Character.isWhitespace(c))
            {
                resultStr += c;
            }
        }
        return resultStr;
    }
//   static String removeWhiteSpaces(String str)
//    {
//
////        String nwstr = str.replaceAll("\\s+","");
////        return nwstr;
//        StringBuilder out = new StringBuilder(str.length());
//
//        char[] charArry = str.toCharArray();
//
//        for(char c :charArry)
//        {
//            if(!Character.isWhitespace(c))
//            {
//                out.append(c);
//            }
//        }
//        return String.valueOf(out);
//    }
    public static void main(String[] args) {
       String st = removeWhiteSpaces("bhanupra   tap bhana");
        System.out.println(st);

        String s = "  abc  def     ";

        s = s.strip();

        System.out.println(s);
    }
}
