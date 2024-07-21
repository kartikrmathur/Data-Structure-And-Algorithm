package datastructures.HashMap

fun main (){
    HashMapGetReplacePut(arrayListOf("IronMan", "Thor", "SpiderMan", "Cap"))
}

fun HashMapGetReplacePut (args:ArrayList<String>){

    var hashMap: HashMap<String,Int> = HashMap<String,Int> ()

    hashMap.put("IronMan",3000)
    hashMap.put("Thor",100)
    hashMap.put("SpiderMan",1100)
    hashMap.put("Cap",1200)

    for(key in hashMap.keys){
        println("Before Replace Element at key $key: ${hashMap[key]}")
    }

    hashMap.replace("Cap",999)

    hashMap.put("Thor",2000)

    for (key in hashMap.keys){
        println("After Replace Elements at key $key : ${hashMap[key]}")
    }

}

