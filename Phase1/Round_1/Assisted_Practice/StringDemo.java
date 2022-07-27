package Phase1.Round_1.Assisted_Practice;

public class StringDemo {
    String s = "abcdtshd";
    String s1 = "abcdef";

    public void stringMethod() {
        System.out.println("------------------     Strings(Method)     ----------------");
        System.out.println("String s = " + s);
        System.out.println("String s1 = " + s1);
        // length....
        System.out.println("\nlength()....s\n>  " + s.length());

        // charAt(index)....
        System.out.println("\ncharAt(2)....s\n>  " + s.charAt(2));

        // indexOf(char)....
        System.out.println("\nindexOf('d')....s\n>  " + s.indexOf('d'));

        // lastIndexOf(char)....
        System.out.println("\nlastIndexOf('d')....s\n>  " + s.lastIndexOf('d'));

        // toUpperCase()....
        System.out.println("\ntoUpperCase()....s.\n>  " + s.toUpperCase());

        // substring(strt,end)....
        System.out.println("\nsubstring(2,5)....s\n>  " + s.substring(2, 5));

        // equals().....
        System.out.println("\nequals()....s1-vs-s\n>  " + s1.equals(s));
        // System.out.println("== " + s1 == (s));

        // split().....
        String s2 = "abcd-ed-f_ij-kl";
        System.out.println("\nString s2 = " + s2);
        System.out.println("\nsplit()....s2");
        String ss[] = s2.split("-");
        for (String l : ss) {
            System.out.println(l);
        }

        /*
         * compareTo s="abcdtshd" s1="abcdef" -ve , 0 , +ve abcdefgh > equal -> 0 > s>s1
         * -> (s.compareTo(s1) -> +ve(difference of char) else -ve
         *
         */
        // compareTo()...
        System.out.println("\ncompareTo()...\n>  " + s1.compareTo(s));

        // concat().....
        System.out.println("\nconcat()...s+s1\n>  " + s.concat(s1));
        System.out.println();
        // System.out.println("concat model 2 " + s + s1);
    }

    public void stringBuffer() {
        // --------------------------       StringBuffer        ------------------------
        String str = "StringBuffer";

        System.out.println("\n------------------     StringBuffer        -------------------");
        System.out.println("String str = " + str);

        // conversion string to stringBuffer....
        StringBuffer sb = new StringBuffer(str);
        System.out.println("\nConversion String to StringBuffer.....");
        System.out.println("StringBuffer sb = " + sb);

        // append(value)....
        sb.append("hijk");
        System.out.println("\nappend(hijk)....\n>  " + sb);

        // insert(pos,value).....
        sb.insert(2, "lkh");
        System.out.println("\ninsert(2,lkh)....\n>  " + sb);

        // delete(src,dst).....
        sb.delete(3, 6);
        System.out.println("\ndelete(3,6)....\n>  " + sb);

        // replace
        sb.replace(2, 5, "java");
        System.out.println("\nreplace(2,5,'java')....\n>  " + sb);

        // conversion StringBuffer to String...
        String ne = sb + ""; // convert string buffer into string ...
        System.out.println("\nconversion StringBuffer to String...  : \n>  " + ne);

        // reverse()....
        sb.reverse();
        System.out.println("\nreverse()....\n>  " + sb);
        System.out.println();

    }

    public void stringBuilder() {
        /// --------------------------          StringBuilder   --------------------------
        String stn = "StringBuilder";

        System.out.println("\n------------------     StringBuilder        -------------------");

        System.out.println("String stn = " + stn);
        
        // conversion string to stringBuilder....
        StringBuffer stb = new StringBuffer(stn);
        System.out.println("\nConversion String to StringBuilder.....");
        System.out.println("StringBuilder stb = " + stb);

        // append(value)....
        stb.append("hi");
        System.out.println("\nappend(hi)....\n>  " + stb);

        // insert(pos,value).....
        stb.insert(2, "lh");
        System.out.println("\ninsert(2,lh)....\n>  " + stb);
        System.out.println();

    }

    public static void main(String[] args) {
        StringDemo sd = new StringDemo();
        sd.stringMethod();
        sd.stringBuffer();
        sd.stringBuilder();

    }

}
