/**
  * Created by nasir on 20/12/2016.
  */
object PalindromeWord {

  def test(input: String): String = {
    val word = input.toLowerCase
    var newWord: String =""
    for(i <- word.length-1 to 0 by -1)
    {
      newWord += word(i)
    }
    //or word.reverse

    if(word.equals(newWord)) {return "YES"}
    else {return "NO"}
  }


  def main(args: Array[String]): Unit =
  {
    print(test("Tattarattat"))
  }
}
