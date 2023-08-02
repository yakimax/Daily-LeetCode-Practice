public int countHi2(String str) {
    if(str.length() <= 2 ){
      return str.equals("hi") ? 1 : 0 ;
    }
    return str.substring(str.length()-3,str.length()).equals("xhi") ? countHi2(str.substring(0,str.length()-3))  : str.substring(str.length()-2,str.length()).equals("hi") ? countHi2(str.substring(0,str.length()-2)) + 1 : countHi2(str.substring(0,str.length()-1))  ;
  }
  