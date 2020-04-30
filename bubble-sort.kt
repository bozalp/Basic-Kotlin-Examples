//BUBBLE SORT WITH KOTLIN
fun main() {
    var temp:Int
    val my_array = mutableListOf(1,5,6,2,15,3,22,78,8)
    println("Unsorted list" + my_array)
    for(i in my_array.size - 1 downTo 0 step 1)
  	{
        for(j in 0 until i){
            if(my_array[j]>my_array[j+1]){
                temp=my_array[j]
                my_array[j] = my_array[j+1]
                my_array[j+1] = temp
            }
        }
    }
    println("Sorted list" + my_array)
}
//bozalp