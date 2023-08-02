public String parenBit(String str) {
  if(str.length()==0){
    return "";
  }
  String s = "" ;
  if(str.charAt(0)=='(' ){
    s = '(' + parenBit(str.substring(1,str.length())) ;
  }else if( str.charAt(0)==')' ){
    s =  parenBit(str.substring(1,str.length())) + ')' ;
  }
  else{
    s = parenBit(str.substring(1,str.length())) ;
  }
  
  
  if( s.length()>0 && s.charAt(s.length()-1)==')' && s.charAt(0)!='(' ){
    s = str.charAt(0) == ')' ? s : str.charAt(0) + s  ;
  }
  return s ;
}
