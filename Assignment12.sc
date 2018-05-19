object Assignment12 {

  val signlist: List[String] = List("alpha", "gamma", "omega", "zeta", "beta")
  var count = 0
  for (signlist1 <- signlist if signlist1.length == 4) {
    count += 1
  }
  println(s" count of strings with length four is $count")




  var signlist2: List[String] = List("alpha", "gamma", "omega", "zeta", "beta")
  var stringlength: Int = 0

  val signlistnew: String = ""
  var newlist = List[String]()
  var newstring: String = ""

  for (signlistnew <- signlist2) {

    stringlength = signlistnew.length
    newstring = signlistnew + " " + stringlength
    newlist::= newstring
  }
 println(s"List of items with it's length is ")
 println(newlist)






  var signlist3: List[String] = List("alpha", "gamma", "omega", "zeta", "beta")
  val signlistnew1: String = ""
  var mcount = 0
  for (signlistnew1 <- signlist3 if signlistnew1.contains("m")) {
    mcount += 1
  }
  println(s" count of strings that contain letter m is $mcount")






  var signlist4: List[String] = List("alpha", "gamma", "omega", "zeta", "beta")
  val signlistnew2: String = ""
  var acount = 0
  for (signlistnew2 <- signlist4 if signlistnew2.startsWith("a")) {
    acount += 1
  }
  println(s" count of strings that starts with letter a is $acount")














  val Mapval= Map("1" -> "alpha", "2" -> "beta", "3" -> "gamma", "4" -> "zeta", "5" -> "omega")
  var keyNum = List[Int]()

  Mapval.keys.foreach{ i =>
    if(Mapval(i).length == 4)
      {
        keyNum ::= i.toInt
    }

  }
  println(keyNum)












  val Mapva2= Map("1" -> "alpha", "2" -> "beta", "3" -> "gamma", "4" -> "zeta", "5" -> "omega")
  var keyNum2 = List[Int]()
  var mzcount = 0
  var tot = 0

  Mapva2.keys.foreach{ j =>
    if(Mapval(j).contains("m") | Mapval(j).contains("z"))
    {
      tot+= 1
      mzcount+= j.toInt
    }
}
  println(mzcount/tot)
}