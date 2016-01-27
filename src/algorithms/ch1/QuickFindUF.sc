class QuickFindUF(N: Int) {
    val array = (0 until N) toArray

    def connected(q: Int, p: Int) = array(q) == array(p)
    def union(q: Int, p: Int) = {
        val pid = array(p)
        val qid = array(q)

        (0 until N) foreach { i =>
            if(array(i) == pid) array.update(i, qid)
        }
    }

    def arrayStr : String = array.mkString(", ")
}

val quickFindUF = new QuickFindUF(6)
quickFindUF.union(0, 1)
quickFindUF.union(1, 2)
quickFindUF.union(3, 5)
quickFindUF.connected(0, 2)
quickFindUF.connected(0, 5)

quickFindUF.arrayStr
