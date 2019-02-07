val amt = 98

var result = ""
var remaining = 0

result = if (amt / 50 != 0) {
    val ret = s"${amt / 50} * 50, " 
    remaining = amt - 50
    ret
  }
  else result
result = if (remaining / 20 != 0) {
    val ret = s"$result ${remaining / 20} * 20,"
    remaining = remaining - 20 * (remaining / 20)
    ret
  }
  else result
result = if (remaining / 10 != 0) {
    val ret = s"$result ${remaining / 10} * 10,"
    remaining = remaining - 10 * (remaining / 10)
    ret
  }
  else result
result = if (remaining / 5 != 0) {
    val ret = s"$result ${remaining / 5} * 5,"
    remaining = remaining - 5 * (remaining / 5)
    ret
  }
  else result
result = if (remaining / 2 != 0) {
    val ret = s"$result ${remaining / 2} * 2,"
    remaining = remaining - 2 * (remaining / 2)
    ret
  }
  else result
result = if (remaining / 1 != 0) {
    val ret = s"$result ${remaining / 1} * 1,"
    remaining = remaining - 1
    ret
  }
  else result

println(result)
