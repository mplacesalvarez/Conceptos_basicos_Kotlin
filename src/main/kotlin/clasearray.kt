class clasearray (val tam:Int){
    fun array(){
        var arr= Array<Int>(size=tam,{indice:Int->indice*6})

        for(i in 0..arr.size-1) {

            print(arr[i]);print("\t")

        }


    }


}