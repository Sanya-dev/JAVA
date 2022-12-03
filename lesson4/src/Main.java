public class Main {
    public static void main(String[] args) {

        //        int a;
//        double d;
//        d = 15.7;
//        a = (int)d;
//        System.out.println(a);
//
//
//
//        double f = 1.5;
//        short c = (short)f;
//        System.out.println(c);
//
//        char s;
//        int t;
//
//        t = 325;
//        s = (char)t;
//
//        System.out.println(s);


//
//        char v;
//        int k;
//
//        v ='K';
//        k = v;
//
//        System.out.println(k);


        String str;

        str = "Пока" ;
        System.out.println(str);
        str += str + " я очень далека" ;
        System.out.println(str);

        System.out.println(str.toUpperCase());
        String subStr = str.substring(9);

        System.out.println(subStr);
        subStr = str.substring(9, 17);
        System.out.println(subStr);

        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
            System.out.println(str.charAt(j));
        }

//        for (int j = 0; j < str.length(); j++ ){     // Для тех кто знает циклы показываю разбор строки на символы.
//            if(str.charAt(j) == 'Я' || str.charAt(j) == 'я' ){   // Для тех кто знаком с условными операторы
//                System.out.println(str.charAt(j));
//            }
//        }


    }
}