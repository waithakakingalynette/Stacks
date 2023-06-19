fun main() {
    var mystack=Stack()
    var string="Adalab"
    for (c in string){
        mystack.push(c)
    }

    var result= mutableListOf<Char>()
    while (mystack.isEmpty()){
        result.add(mystack.pop()!!)
    }

    println(result.joinToString(""))
//    println(mystack.pop())
//    mystack.push(67)
//    mystack.push(32)
//    mystack.push(45)
//    println(mystack.peak())
//    mystack.pop()
//    mystack.push(18)
//    var x=mystack.pop()
//    var y=mystack.pop()
//    var z=x!!+y!!   //this help in turning a null to an int. use this operator if you are sure that the value is not an null
//    println(z)



}

class Stack{
    var data= mutableListOf<Char>()

    fun push(value:Char){
        data.add(value)
    }

    fun pop():Char?{
        if(data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex] //help in accessing the last index of the list
        data.removeAt(data.lastIndex) //removing an item from the last index
        return top
    }

    fun peak():Char?{
        if (data.isEmpty()){
            return  null
        }
        return  data[data.lastIndex]   //tells you what element is at the top.
    }

    fun isEmpty():Boolean{
        if (data.isEmpty()){
            return true
        }
        return false
    }
}