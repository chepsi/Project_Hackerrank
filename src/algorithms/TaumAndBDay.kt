package algorithms

fun main() {
    println(taumBday(27984, 1402, 619246, 615589, 247954))
    println(18192035842)
}

fun taumBday(b: Long, w: Long, bc: Long, wc: Long, z: Long): Long {
    // Write your code here
    return if (bc<wc && (bc + z) < wc){
        (b*bc+(w*(bc+z)))
    }
    else if (wc<bc && (wc + z) < bc){
        (w*wc+(b*(wc+z)))
    }
    else{
        (b*bc+w*wc)
    }
}
