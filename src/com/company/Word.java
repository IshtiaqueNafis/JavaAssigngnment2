package com.company;

public class Word {
//region properties
    public String term;
  //endregion

//region constructor
    public Word(String term) {
        this.term = term;
    }
// endregion

 //region privateMethod
  private int hashworker(){
     var value = 0;
      for ( var letter:term.toCharArray()) {
       value+=letter;
      }
      return  value; // adding up all the value.
  }
  //endregion

 //region   OverRideMembers;
    @Override
    public String toString() {
        return "Word{" +
                "Term='" + term + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 2*hashworker()+3; // customized hash
    }
    //endregion
}
