package edu.northeastern.mengzhe;

class Q17 {



    private int idx = -1;

    public NestedInteger deserialize(String s) {

        NestedInteger nestedInteger = new NestedInteger();

        while(++idx < s.length()){


            char ch = s.charAt(idx);


            if (ch == '-' || Character.isDigit(ch)){
                int num = 0; int sign = 1;

                while(idx < s.length() && (ch == '-' || Character.isDigit(ch))){
                    if (ch == '-'){
                        sign = -1;
                    }else{
                        num = num * 10 + ch - '0';
                    }
                    if (++idx < s.length()) ch = s.charAt(idx);
                }


                num = num * sign;
                NestedInteger ni = new NestedInteger(num);


                if (idx == s.length()) return ni;

                nestedInteger.add(ni);
                idx--;
            }else if (ch == '['){
                if(idx == 0) return deserialize(s);
                nestedInteger.add(deserialize(s));
            }else if (ch == ','){
                continue;
            }else{
              
                break;
            }
        }

        return  nestedInteger;
    }
}