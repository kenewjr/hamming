object Hamming {

    fun compute(leftStrand: String , rightStrand: String): Int {
       var distance=0
           if(leftStrand.length > rightStrand.length){
		   println("left and right strands must be of equal length.")
    }
	if(leftStrand.length < rightStrand.length){
		   println("left and right strands must be of equal length.")
		   }
		for(i in 0 until leftStrand.length){
		if(leftStrand[i] != rightStrand[i]){
		distance++
		}
		}
		return distance
		}
}
